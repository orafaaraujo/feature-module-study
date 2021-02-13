package com.orafaraujo.usecases.loadprofileimpl

import com.orafaraujo.repositories.profileapi.ProfileRepository
import com.orafaraujo.usecases.loadprofileapi.LoadProfileUseCase
import com.orafaraujo.usecases.loadprofileapi.models.ProfileDTO
import com.orafaraujo.usecases.loadprofileimpl.mapper.LoadProfileUseCaseMapper

class LoadProfileUseCaseImpl(
    private val repository: ProfileRepository,
    private val mapper: LoadProfileUseCaseMapper
) : LoadProfileUseCase {

    override suspend fun loadProfile(id: Long): ProfileDTO {
        val profile = repository.fetchProfile(id)
        return mapper.toModel(profile)
    }
}
