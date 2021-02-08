package com.orafaraujo.features.home.di

import com.orafaraujo.features.home.HomeNavigationImpl
import com.orafaraujo.shared.navigation.features.HomeNavigation
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
abstract class HomeModule {

    @Binds
    abstract fun provideHomeNavigation(impl: HomeNavigationImpl): HomeNavigation
}
