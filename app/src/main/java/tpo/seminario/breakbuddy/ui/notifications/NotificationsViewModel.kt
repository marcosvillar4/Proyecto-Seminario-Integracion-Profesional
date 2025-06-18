package tpo.seminario.breakbuddy.ui.notifications

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NotificationsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "No hay notificaciones."
    }
    val text: LiveData<String> = _text
}