package tpo.seminario.breakbuddy.ui.notifications

import android.app.*
import android.content.*
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.text.Editable
import android.text.TextWatcher
import android.text.format.DateFormat
import android.util.Log
import android.view.*
import android.widget.*
import androidx.fragment.app.Fragment
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import tpo.seminario.breakbuddy.R
import tpo.seminario.breakbuddy.databinding.FragmentNotificationsBinding
import java.util.*
import com.google.android.material.switchmaterial.SwitchMaterial
import com.google.android.gms.ads.AdListener
import com.google.android.gms.ads.LoadAdError


class NotificationsFragment : Fragment() {

    // AdMob
    private lateinit var adView: AdView
    private val retryDelayMs = 2000L

    private var _b: FragmentNotificationsBinding? = null
    private val b get() = _b!!
    private lateinit var prefs: SharedPreferences
    private lateinit var alarmMgr: AlarmManager

    private val types = listOf(
        "hidratacion" to "Hidratación",
        "alimentacion" to "Alimentación",
        "movilidad" to "Movilidad",
        "ergonomia" to "Ergonomía",
        "extra" to "Extra"
    )

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _b = FragmentNotificationsBinding.inflate(inflater, container, false)
        return b.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        // banner AdMob
        adView = view.findViewById(R.id.adViewNotifications)
        adView.adListener = object : AdListener() {
            override fun onAdLoaded() {
                Log.d("AdMob", "Notifications banner loaded")
            }
            override fun onAdFailedToLoad(error: LoadAdError) {
                Log.e("AdMob", "Notifications banner failed: ${error.message}")
                Handler(Looper.getMainLooper()).postDelayed({
                    adView.loadAd(AdRequest.Builder().build())
                }, retryDelayMs)
            }
        }
        adView.loadAd(AdRequest.Builder().build())


        prefs = requireContext().getSharedPreferences("notif_prefs", Context.MODE_PRIVATE)
        alarmMgr = requireContext().getSystemService(Context.ALARM_SERVICE) as AlarmManager

        //Modo descanso
        b.btnDoNotDisturb.setOnClickListener { disableAll() }

        // Inflar filas dinámicamente
        types.forEach { (key, label) ->
            val row = layoutInflater.inflate(R.layout.notification_row, b.llRows, false)
            row.tag = key
            b.llRows.addView(row)
            setupRow(key, label, row)
        }
    }

    private fun setupRow(key: String, labelText: String, row: View) {
        val sw = row.findViewById<SwitchMaterial>(R.id.switchEnable)
        val tv      = row.findViewById<TextView>(R.id.tvLabel)
        val btnFrom = row.findViewById<Button>(R.id.btnFrom)
        val btnTo   = row.findViewById<Button>(R.id.btnTo)
        val etFreq  = row.findViewById<EditText>(R.id.etFreq)

        tv.text = labelText

        // Leer prefs
        val enabled = prefs.getBoolean("${key}_on", false)
        val fromH   = prefs.getInt("${key}_fromH", 9)
        val fromM   = prefs.getInt("${key}_fromM", 0)
        val toH     = prefs.getInt("${key}_toH", 18)
        val toM     = prefs.getInt("${key}_toM", 0)
        val freq    = prefs.getInt("${key}_freq", 60)

        // Variables mutables
        var fromH_ = fromH
        var fromM_ = fromM
        var toH_   = toH
        var toM_   = toM
        var freq_  = freq

        sw.isChecked = enabled
        btnFrom.text = "%02d:%02d".format(fromH, fromM)
        btnTo.text   = "%02d:%02d".format(toH, toM)
        etFreq.setText(freq.toString())

        // Guarda y programa/cancela
        fun saveAnd(schedule: Boolean) {
            prefs.edit()
                .putBoolean("${key}_on", sw.isChecked)
                .putInt("${key}_fromH", fromH_)
                .putInt("${key}_fromM", fromM_)
                .putInt("${key}_toH", toH_)
                .putInt("${key}_toM", toM_)
                .putInt("${key}_freq", freq_)
                .apply()
            if (schedule) scheduleAlarm(key) else cancelAlarm(key)
        }

        sw.setOnCheckedChangeListener { _, _ -> saveAnd(true) }

        btnFrom.setOnClickListener {
            showTimePicker(fromH_, fromM_) { h, m ->
                fromH_ = h; fromM_ = m
                btnFrom.text = "%02d:%02d".format(h, m)
                saveAnd(true)
            }
        }
        btnTo.setOnClickListener {
            showTimePicker(toH_, toM_) { h, m ->
                toH_ = h; toM_ = m
                btnTo.text = "%02d:%02d".format(h, m)
                saveAnd(true)
            }
        }

        etFreq.addTextChangedListener(object: TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                val v = s.toString().toIntOrNull() ?: return
                freq_ = v.coerceAtLeast(1)  // al menos 1 minuto
                saveAnd(true)
            }
            override fun beforeTextChanged(s: CharSequence?, st: Int, c: Int, a: Int) {}
            override fun onTextChanged(s: CharSequence?, st: Int, b: Int, c: Int) {}
        })
    }

    private fun showTimePicker(h0: Int, m0: Int, onSet: (Int, Int) -> Unit) {
        TimePickerDialog(requireContext(), { _, h, m -> onSet(h, m) },
            h0, m0, DateFormat.is24HourFormat(requireContext())
        ).show()
    }

    private fun disableAll() {
        types.forEach { (key, _) ->
            prefs.edit().putBoolean("${key}_on", false).apply()
            cancelAlarm(key)


            val rowView = b.llRows.findViewWithTag<View>(key) ?: return@forEach

            val sw = rowView.findViewById<SwitchMaterial>(R.id.switchEnable)
            sw.isChecked = false
        }
        Toast.makeText(requireContext(), "Modo descanso activado", Toast.LENGTH_SHORT).show()
    }


    private fun scheduleAlarm(key: String) {
        cancelAlarm(key)
        val intent = Intent(requireContext(), NotificationReceiver::class.java)
            .putExtra("type", key)
        val pi = PendingIntent.getBroadcast(
            requireContext(),
            key.hashCode(),
            intent,
            PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE
        )
        val on = prefs.getBoolean("${key}_on", false)
        if (!on) return

        // Recuperar prefs actualizados
        val fromH = prefs.getInt("${key}_fromH", 0)
        val fromM = prefs.getInt("${key}_fromM", 0)
        val freqM = prefs.getInt("${key}_freq", 60)

        val now = Calendar.getInstance()
        val start = Calendar.getInstance().apply {
            set(Calendar.HOUR_OF_DAY, fromH)
            set(Calendar.MINUTE, fromM)
            set(Calendar.SECOND, 0)
        }
        if (now.after(start)) start.add(Calendar.MINUTE, freqM)

        val interval = freqM * 60 * 1000L
        alarmMgr.setInexactRepeating(
            AlarmManager.RTC_WAKEUP,
            start.timeInMillis,
            interval,
            pi
        )
    }

    private fun cancelAlarm(key: String) {
        val intent = Intent(requireContext(), NotificationReceiver::class.java)
        val pi = PendingIntent.getBroadcast(
            requireContext(),
            key.hashCode(),
            intent,
            PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE
        )
        alarmMgr.cancel(pi)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _b = null
    }
}
