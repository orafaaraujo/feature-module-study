package com.orafaraujo.featuremodulestudy.di

import com.orafaraujo.shared.navigation.NavigationProvider
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
abstract class NavigationProviderModule {

    @Binds
    abstract fun provideNavigationProvider(impl: NavigationProviderImpl): NavigationProvider
}
