package com.orafaraujo.repositories.profileapi

import com.orafaraujo.repositories.profileapi.models.ProfileResponse

interface ProfileRepository {

    suspend fun fetchProfile(id: Long): ProfileResponse
}
