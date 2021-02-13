package com.orafaraujo.usecases.loadprofileapi

import com.orafaraujo.usecases.loadprofileapi.models.ProfileDTO

interface LoadProfileUseCase {

   suspend fun loadProfile(id: Long): ProfileDTO
}
