package com.orafaraujo.features.profileimpl.view

import com.orafaraujo.features.profileapi.models.ProfilePresentationModel

sealed class ProfileStates {

    object Loading : ProfileStates()

    data class Success(val presentationObject: ProfilePresentationModel) : ProfileStates()

    data class Error(val message: String? = "Generic message") : ProfileStates()
}
