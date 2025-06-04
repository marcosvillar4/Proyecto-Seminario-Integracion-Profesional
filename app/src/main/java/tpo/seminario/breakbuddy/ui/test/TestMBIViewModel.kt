package tpo.seminario.breakbuddy.ui.test

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import tpo.seminario.breakbuddy.persistence.TestRepository

class TestMBIViewModel : ViewModel() {

    private val repo = TestRepository()

    // LiveData para notificar éxito (devuelve el testId guardado)
    private val _saveSuccess = MutableLiveData<String?>()
    val saveSuccess: LiveData<String?> = _saveSuccess

    // LiveData para notificar error al guardar
    private val _saveError = MutableLiveData<String?>()
    val saveError: LiveData<String?> = _saveError

    /**
     * Llama a repo.saveTestResult y actualiza los LiveData.
     */
    fun saveResult(result: TestResult) {
        _saveError.value = null
        _saveSuccess.value = null

        repo.saveTestResult(
            result = result,
            onSuccess = { newId ->
                _saveSuccess.postValue(newId)
            },
            onFailure = { errMsg ->
                _saveError.postValue(errMsg)
            }
        )
    }

    fun clearSaveStates() {
        _saveError.value = null
        _saveSuccess.value = null
    }
}