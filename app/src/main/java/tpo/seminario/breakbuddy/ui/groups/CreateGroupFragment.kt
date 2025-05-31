package tpo.seminario.breakbuddy.ui.groups

import android.app.AlertDialog
import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.content.res.ColorStateList
import android.os.Bundle
import android.util.Patterns
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.core.widget.addTextChangedListener
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.google.android.material.textfield.TextInputLayout
import com.google.firebase.firestore.FirebaseFirestore
import tpo.seminario.breakbuddy.R
import tpo.seminario.breakbuddy.databinding.FragmentCreateGroupBinding
import tpo.seminario.breakbuddy.util.HobbiesList
import tpo.seminario.breakbuddy.util.Organization
import tpo.seminario.breakbuddy.persistence.OrganizationRepository
import tpo.seminario.breakbuddy.persistence.UserRepository


class CreateGroupFragment : Fragment() {

    private var _binding: FragmentCreateGroupBinding? = null
    private val binding get() = _binding!!
    private val viewModel: GroupsViewModel by viewModels()

    private lateinit var radioType: RadioGroup
    private lateinit var rbPersonal: RadioButton
    private lateinit var rbOrganization: RadioButton
    private lateinit var layoutOrg: TextInputLayout
    private lateinit var inputOrg: AutoCompleteTextView
    private val userRepo = UserRepository()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentCreateGroupBinding.inflate(inflater, container, false)
        setupViews()
        observeViewModel()

        return binding.root
    }

    private fun setupViews() {
        // Configurar listeners para validación en tiempo real
        binding.inputGroupName.addTextChangedListener {
            clearFieldError(binding.layoutGroupName)
        }

        binding.inputEmails.addTextChangedListener {
            clearFieldError(binding.layoutEmails)
        }

        // Configurar AutoCompleteTextView para hobbies
        setupHobbyDropdown()

        binding.btnCreateGroup.setOnClickListener {
            createGroup()
        }

        radioType = binding.radioType
        rbPersonal = binding.rbPersonal
        rbOrganization = binding.rbOrganization
        layoutOrg = binding.layoutOrg

        // Mostrar/ocultar selector de org
        radioType.setOnCheckedChangeListener { _, checkedId ->
            layoutOrg.visibility = if (checkedId == R.id.rbOrganization) View.VISIBLE else View.GONE
        }
    }

    private fun setupHobbyDropdown() {
        // Crear lista con opción vacía al inicio
        val hobbiesWithEmpty = listOf("") + HobbiesList.DEFAULT

        val adapter = ArrayAdapter(
            requireContext(),
            android.R.layout.simple_dropdown_item_1line,
            hobbiesWithEmpty
        )

        binding.inputHobby.setAdapter(adapter)
        binding.inputHobby.threshold = 1 // Mostrar dropdown después de 1 carácter

        // Listener para limpiar error cuando se selecciona algo
        binding.inputHobby.setOnItemClickListener { _, _, _, _ ->
            clearFieldError(binding.layoutHobby)
        }

        // También limpiar error cuando se escribe
        binding.inputHobby.addTextChangedListener {
            clearFieldError(binding.layoutHobby)
        }
    }

    private fun observeViewModel() {
        viewModel.uiState.observe(viewLifecycleOwner) { state ->
            updateUI(state)
        }
    }

    private fun createGroup() {
        val name = binding.inputGroupName.text.toString().trim()
        val emailsText = binding.inputEmails.text.toString().trim()
        val hobbyText = binding.inputHobby.text.toString().trim()

        // 1) Validar hobby si no está vacío…
        val hobby = if (hobbyText.isBlank()) {
            null
        } else if (HobbiesList.DEFAULT.contains(hobbyText)) {
            hobbyText
        } else {
            showFieldError(binding.layoutHobby, "Debe seleccionar un hobby de la lista")
            return
        }

        // 2) Validar inputs básicos
        if (!validateInputs(name, emailsText)) {
            return
        }

        // 3) Procesar lista separada de emails (split, trim, filter, distinct, patrones)
        val allEmails = processEmails(emailsText)
        if (allEmails.isEmpty()) {
            showFieldError(binding.layoutEmails, "Debe ingresar al menos un email válido")
            return
        }

        // 4) Determinar tipo (personal u organization) y orgName si aplica
        val type = if (rbOrganization.isChecked) "organization" else "personal"
        val orgName = binding.inputOrg.text.toString().trim()
        if (type == "organization" && orgName.isBlank()) {
            showFieldError(layoutOrg, "Debes indicar un nombre de organización")
            return
        }

        // 5) ANTES DE CREAR, VERIFICAR QUE CADA EMAIL EXISTA EN FIRESTORE
        //    → Si alguno NO existe, mostrar error y NO llamar a actuallyCreateGroup.
        userRepo.validateEmailsExist(
            emails = allEmails,
            onComplete = { existents, notExistents ->
                if (notExistents.isNotEmpty()) {
                    // Hay correos inválidos/no registrados:
                    val missing = notExistents.joinToString(separator = ", ")
                    showErrorToast("Los siguientes emails NO están registrados: $missing")
                    return@validateEmailsExist
                }
                // Si llegamos acá, TODOS los emails existen.
                // 6) Si es tipo “organization”, reviso en Firestore “organizations/{name}”
                if (type == "organization") {
                    FirebaseFirestore.getInstance()
                        .collection("organizations")
                        .whereEqualTo("name", orgName)
                        .get()
                        .addOnSuccessListener { snap ->
                            val orgId: String
                            if (snap.isEmpty) {
                                // 6a) Si no existe la org, la creamos, y continuamos con su ID:
                                createOrganization(orgName) { newOrgId ->
                                    actuallyCreateGroup(name, allEmails, hobby, type, newOrgId)
                                }
                                return@addOnSuccessListener
                            } else {
                                // 6b) Si existe, tomo el primer ID
                                orgId = snap.documents.first().id
                            }
                            actuallyCreateGroup(name, allEmails, hobby, type, orgId)
                        }
                        .addOnFailureListener { e ->
                            showErrorToast("Error buscando organización: ${e.message}")
                        }
                } else {
                    // 7) Si es tipo “personal”, simplemente sigo adelante
                    actuallyCreateGroup(name, allEmails, hobby, type, null)
                }
            },
            onError = { exception ->
                showErrorToast("Error validando emails: ${exception.message}")
            }
        )
    }




private fun createOrganization(name: String, callback: (String)->Unit) {
    val ref = FirebaseFirestore.getInstance()
        .collection("organizations")
        .document()
    ref.set(mapOf("name" to name))
        .addOnSuccessListener { callback(ref.id) }
        .addOnFailureListener {
            showErrorToast("No se pudo crear la organización")
        }
}

private fun actuallyCreateGroup(
    name: String,
    emails: List<String>,
    hobby: String?,
    type: String,
    orgId: String?
) {
    viewModel.createGroup(name, emails, hobby, type, orgId)
}

    private fun validateInputs(name: String, emailsText: String): Boolean {
        var isValid = true

        // Validar nombre
        when {
            name.isBlank() -> {
                showFieldError(binding.layoutGroupName, "El nombre del grupo es obligatorio")
                isValid = false
            }
            name.length < 3 -> {
                showFieldError(binding.layoutGroupName, "El nombre debe tener al menos 3 caracteres")
                isValid = false
            }
            name.length > 50 -> {
                showFieldError(binding.layoutGroupName, "El nombre no puede exceder 50 caracteres")
                isValid = false
            }
        }

        // Validar que se hayan ingresado emails
        if (emailsText.isBlank()) {
            showFieldError(binding.layoutEmails, "Debe ingresar al menos un email")
            isValid = false
        }

        return isValid
    }

    private fun processEmails(emailsText: String): List<String> {
        return emailsText
            .split(',', ';', ' ', '\n') // Permitir múltiples separadores
            .map { it.trim() }
            .filter { it.isNotEmpty() }
            .distinct() // Eliminar duplicados
            .filter { email ->
                if (Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                    true
                } else {
                    // Mostrar toast para emails inválidos específicos
                    showErrorToast("Email inválido: $email")
                    false
                }
            }
            .take(20) // Limitar a 20 emails máximo
    }

    private fun updateUI(state: GroupCreationState) {
        // Mostrar/ocultar loading
        binding.progressBar.visibility = if (state.isLoading) View.VISIBLE else View.GONE

        // Habilitar/deshabilitar botón
        binding.btnCreateGroup.isEnabled = !state.isLoading
        binding.btnCreateGroup.text = if (state.isLoading) "Creando..." else "Crear Grupo"

        // Cambiar color del botón según estado
        binding.btnCreateGroup.backgroundTintList = ColorStateList.valueOf(
            ContextCompat.getColor(
                requireContext(),
                if (state.isLoading) R.color.green_500 else R.color.green_200
            )
        )

        // Habilitar/deshabilitar inputs
        binding.inputGroupName.isEnabled = !state.isLoading
        binding.inputEmails.isEnabled = !state.isLoading
        binding.inputHobby.isEnabled = !state.isLoading

        // Manejar resultado
        when {
            state.isSuccess -> {
                showSuccessDialog(state.groupCode ?: "")
            }
            state.errorMessage != null -> {
                showErrorMessage(state.errorMessage)
                viewModel.clearError() // Limpiar el error después de mostrarlo
            }
        }
    }

    private fun showSuccessDialog(groupCode: String) {
        // 1) Capturamos context y navController antes de mostrar el diálogo
        val ctx = requireContext()
        val nav = findNavController()
        val clipboard = ctx.getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager

        AlertDialog.Builder(ctx)
            .setTitle("¡Grupo Creado!")
            .setMessage("Tu grupo ha sido creado exitosamente.\nCódigo: $groupCode")
            .setPositiveButton("Copiar Código") { _, _ ->
                // 2) Usa las referencias capturadas
                val clip = ClipData.newPlainText("Código de Grupo", groupCode)
                clipboard.setPrimaryClip(clip)
                Toast.makeText(ctx, "Código copiado al portapapeles", Toast.LENGTH_SHORT).show()
                nav.popBackStack()
            }
            .setNegativeButton("Cerrar") { _, _ ->
                nav.popBackStack()
            }
            .setCancelable(false)
            .show()
    }


    private fun copyToClipboard(text: String) {
        val clipboard = requireContext().getSystemService(android.content.Context.CLIPBOARD_SERVICE)
                as android.content.ClipboardManager
        val clip = android.content.ClipData.newPlainText("Código de Grupo", text)
        clipboard.setPrimaryClip(clip)
    }

    private fun showErrorMessage(message: String) {
        showErrorToast(message)
    }

    private fun showSuccessToast(message: String) {
        Toast.makeText(requireContext(), message, Toast.LENGTH_SHORT).apply {
            view?.backgroundTintList = ColorStateList.valueOf(
                ContextCompat.getColor(requireContext(), R.color.exito)
            )
        }.show()
    }

    private fun showErrorToast(message: String) {
        Toast.makeText(requireContext(), message, Toast.LENGTH_LONG).apply {
            view?.backgroundTintList = ColorStateList.valueOf(
                ContextCompat.getColor(requireContext(), R.color.error)
            )
        }.show()
    }

    private fun showFieldError(textInputLayout: TextInputLayout, message: String) {
        textInputLayout.error = message
        textInputLayout.boxStrokeErrorColor = ColorStateList.valueOf(
            ContextCompat.getColor(requireContext(), R.color.error)
        )
        textInputLayout.setErrorTextColor(
            ColorStateList.valueOf(
                ContextCompat.getColor(requireContext(), R.color.error)
            )
        )
        textInputLayout.requestFocus()
    }

    private fun clearFieldError(textInputLayout: com.google.android.material.textfield.TextInputLayout) {
        textInputLayout.error = null
        textInputLayout.boxStrokeColor = ContextCompat.getColor(requireContext(), R.color.green_500)
    }

    private fun navigateBack() {
        findNavController().popBackStack()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}