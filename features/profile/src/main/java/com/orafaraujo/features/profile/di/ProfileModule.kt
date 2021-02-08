package com.orafaraujo.features.profile.di

import com.orafaraujo.features.profile.ProfileNavigationImpl
import com.orafaraujo.shared.navigation.features.ProfileNavigation
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
abstract class ProfileModule {

    @Binds
    abstract fun provideProfileNavigation(impl: ProfileNavigationImpl): ProfileNavigation
}
