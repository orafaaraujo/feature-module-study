package com.orafaraujo.featuremodulestudy.di

import com.orafaraujo.featuremodulestudy.di.features.ProfileModule
import com.orafaraujo.featuremodulestudy.di.features.SubComponentsModule
import com.orafaraujo.featuremodulestudy.di.viewmodel.ViewModelFactoryModule
import com.orafaraujo.features.home.di.HomeComponent
import com.orafaraujo.features.profileimpl.di.ProfileComponent
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AppModule::class,
        ViewModelFactoryModule::class,
        SubComponentsModule::class,
        ProfileModule::class
    ]
)
interface AppComponent {

    fun homeComponentFactory(): HomeComponent.Factory

    fun profileComponentFactory(): ProfileComponent.Factory
}
