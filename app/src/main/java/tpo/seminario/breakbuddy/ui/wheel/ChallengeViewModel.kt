package tpo.seminario.breakbuddy.ui.wheel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import tpo.seminario.breakbuddy.util.DesafioGamificado

class ChallengeViewModel : ViewModel() {
    // Map nombre → DesafioGamificado de los 6 actuales en la ruleta
    private val _currentChallenges = MutableLiveData<Map<String, DesafioGamificado>>()
    val currentChallenges: LiveData<Map<String, DesafioGamificado>> = _currentChallenges

    // Se invoca desde WheelFragment cuando se genera la nueva combinación
    fun setCurrentChallenges(map: Map<String, DesafioGamificado>) {
        _currentChallenges.value = map
    }
}
