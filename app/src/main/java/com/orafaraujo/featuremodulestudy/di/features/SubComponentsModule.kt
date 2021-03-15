package com.orafaraujo.featuremodulestudy.di.features

import com.orafaraujo.features.detailimpl.di.DetailComponent
import com.orafaraujo.features.home.di.HomeComponent
import com.orafaraujo.features.profileimpl.di.ProfileComponent
import dagger.Module

@Module(
    subcomponents = [
        HomeComponent::class,
        ProfileComponent::class,
        DetailComponent::class
    ]
)
object SubComponentsModule
