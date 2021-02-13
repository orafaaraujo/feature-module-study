package com.orafaraujo.repositories.profileapi

import com.orafaraujo.repositories.profileapi.models.Profile

interface ProfileRepository {

    suspend fun fetchProfile(id: Long): Profile
}
