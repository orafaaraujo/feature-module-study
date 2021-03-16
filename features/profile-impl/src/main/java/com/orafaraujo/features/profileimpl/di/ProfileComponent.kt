package com.orafaraujo.features.profileimpl.di

import com.orafaraujo.features.profileimpl.view.ProfileActivity
import dagger.Subcomponent

@Subcomponent
interface ProfileComponent {

    @Subcomponent.Factory
    interface Factory {
        fun create(): ProfileComponent
    }

    fun inject(profileActivity: ProfileActivity)
}

interface ProfileComponentProvider {

    fun provideProfileComponentFactory(): ProfileComponent.Factory
}
