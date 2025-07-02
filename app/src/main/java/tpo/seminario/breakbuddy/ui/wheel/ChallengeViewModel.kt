package tpo.seminario.breakbuddy.ui.wheel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import tpo.seminario.breakbuddy.util.DesafioGamificado

class ChallengeViewModel : ViewModel() {
    private val _currentChallenges = MutableLiveData<Map<String, DesafioGamificado>>()
    val currentChallenges: LiveData<Map<String, DesafioGamificado>> = _currentChallenges

    fun setCurrentChallenges(map: Map<String, DesafioGamificado>) {
        _currentChallenges.value = map
    }
}
