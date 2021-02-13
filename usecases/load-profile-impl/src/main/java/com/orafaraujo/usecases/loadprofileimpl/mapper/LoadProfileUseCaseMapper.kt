package com.orafaraujo.usecases.loadprofileimpl.mapper

import com.orafaraujo.repositories.profileapi.models.ProfileResponse
import com.orafaraujo.usecases.loadprofileapi.models.ProfileDTO

class LoadProfileUseCaseMapper {

    fun toModel(response: ProfileResponse): ProfileDTO =
        ProfileDTO(
            id = response.id,
            name = response.name
        )
}
