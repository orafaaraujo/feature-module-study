package com.orafaraujo.repositories.profileimpl

import com.orafaraujo.repositories.profileapi.ProfileRepository
import com.orafaraujo.repositories.profileapi.models.Profile

class ProfileRepositoryImpl : ProfileRepository {

    override suspend fun fetchProfile(id: Long): Profile {
        return Profile(id, "John Locke", "33 Boulevard Victor")
    }

}
