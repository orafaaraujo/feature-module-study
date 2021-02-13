package com.orafaraujo.usecases.loadprofileapi

import com.orafaraujo.usecases.loadprofileapi.models.Profile

interface LoadProfileUseCase {

    fun loadProfile(id: Long): Profile
}
