package com.orafaraujo.features.profile

sealed class ProfileStates {

    object Loading : ProfileStates()

    data class Success(val presentationObject: ProfilePresentationModel) : ProfileStates()

    data class Error(val message: String? = "Generic message") : ProfileStates()
}
