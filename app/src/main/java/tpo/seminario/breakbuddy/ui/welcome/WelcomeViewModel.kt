package tpo.seminario.breakbuddy.ui.welcome

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

class WelcomeViewModel : ViewModel(){
    private val _text = MutableLiveData<String>().apply{
        value = "¡Bienvenido a BreakBuddy!"
    }

    val text: LiveData<String> = _text;
}
