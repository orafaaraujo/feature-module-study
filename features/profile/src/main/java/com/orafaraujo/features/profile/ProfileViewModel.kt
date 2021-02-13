package com.orafaraujo.features.profile

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.orafaraujo.usecases.loadprofileapi.LoadProfileUseCase
import kotlinx.coroutines.launch

class ProfileViewModel(
    private val useCase: LoadProfileUseCase
) : ViewModel() {

    fun loadProfile(id: Long) {
        viewModelScope.launch {
            useCase.loadProfile(id)
        }
    }
}
