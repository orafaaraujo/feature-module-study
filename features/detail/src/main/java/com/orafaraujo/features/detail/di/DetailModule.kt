package com.orafaraujo.features.detail.di

import com.orafaraujo.features.detail.DetailNavigationImpl
import com.orafaraujo.shared.navigation.features.DetailNavigation
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
abstract class DetailModule {

    @Binds
    abstract fun provideDetailNavigation(impl: DetailNavigationImpl): DetailNavigation
}
