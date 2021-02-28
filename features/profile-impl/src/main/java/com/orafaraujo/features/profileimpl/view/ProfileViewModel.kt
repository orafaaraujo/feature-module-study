package com.orafaraujo.features.profileimpl.view

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.orafaraujo.usecases.loadprofileapi.LoadProfileUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

private const val TAG = "ProfileViewModel"

class ProfileViewModel @Inject constructor(
    private val useCase: LoadProfileUseCase,
    private val mapper: ProfileMapper,
) : ViewModel() {

    private val _states = MutableStateFlow<ProfileStates>(ProfileStates.Loading)
    val states = _states

    fun loadProfile(id: Long) {
        Log.d(TAG, "loadProfile() called with: id = [$id]")
        viewModelScope
            .launch {
                try {
                    val profile = useCase.loadProfile(id)
                    val presentationModel = mapper.toPresentationModel(profile)
                    val successState = ProfileStates.Success(presentationModel)
                    _states.value = successState
                } catch (exception: RuntimeException) {
                    val errorState = ProfileStates.Error(exception.message)
                    _states.value = errorState
                }
            }
    }
}
