package com.orafaraujo.usecases.loadprofileimpl

import com.orafaraujo.usecases.loadprofileapi.LoadProfileUseCase
import com.orafaraujo.usecases.loadprofileapi.models.Profile

class LoadProfileUseCaseImpl : LoadProfileUseCase {

    override fun loadProfile(id: Long): Profile {
        return Profile(id, "John Locke")
    }

}
