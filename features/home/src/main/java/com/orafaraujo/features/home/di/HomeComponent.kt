package com.orafaraujo.features.home.di

import com.orafaraujo.features.home.HomeActivity
import dagger.Subcomponent

@Subcomponent
interface HomeComponent {

    @Subcomponent.Factory
    interface Factory {
        fun create(): HomeComponent
    }

    fun inject(profileActivity: HomeActivity)
}

interface HomeComponentProvider {

    fun provideHomeComponentFactory(): HomeComponent.Factory
}
