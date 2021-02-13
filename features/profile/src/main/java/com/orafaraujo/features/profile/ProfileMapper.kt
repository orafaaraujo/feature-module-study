package com.orafaraujo.features.profile

import com.orafaraujo.usecases.loadprofileapi.models.ProfileDTO

class ProfileMapper {

    fun toPresentationModel(profile: ProfileDTO): ProfilePresentationModel {
        return ProfilePresentationModel(
            id = profile.id,
            name = profile.name
        )
    }
}
