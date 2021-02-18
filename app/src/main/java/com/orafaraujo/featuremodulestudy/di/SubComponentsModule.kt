package com.orafaraujo.featuremodulestudy.di

import com.orafaraujo.features.home.di.HomeComponent
import com.orafaraujo.features.profileimpl.di.ProfileComponent
import dagger.Module

@Module(
    subcomponents = [
        HomeComponent::class,
        ProfileComponent::class
    ]
)
object SubComponentsModule
