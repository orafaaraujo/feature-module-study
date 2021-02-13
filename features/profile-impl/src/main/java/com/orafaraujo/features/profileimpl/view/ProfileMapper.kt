package com.orafaraujo.features.profileimpl.view

import com.orafaraujo.features.profileapi.models.ProfilePresentationModel
import com.orafaraujo.usecases.loadprofileapi.models.ProfileDTO

class ProfileMapper {

    fun toPresentationModel(profile: ProfileDTO): ProfilePresentationModel {
        return ProfilePresentationModel(
            id = profile.id,
            name = profile.name
        )
    }
}
