package com.orafaraujo.repositories.profileimpl

import com.orafaraujo.repositories.profileapi.ProfileRepository
import com.orafaraujo.repositories.profileapi.models.ProfileResponse

class ProfileRepositoryImpl : ProfileRepository {

    override suspend fun fetchProfile(id: Long): ProfileResponse {
        return ProfileResponse(id, "John Locke", "33 Boulevard Victor")
    }

}
