package com.orafaraujo.featuremodulestudy

import android.app.Application
import com.orafaraujo.featuremodulestudy.di.AppComponent
import com.orafaraujo.featuremodulestudy.di.DaggerAppComponent
import com.orafaraujo.featuremodulestudy.di.UtilsModule
import com.orafaraujo.features.home.di.HomeComponent
import com.orafaraujo.features.home.di.HomeComponentProvider
import com.orafaraujo.features.profileimpl.di.ProfileComponent
import com.orafaraujo.features.profileimpl.di.ProfileComponentProvider

class MainApplication : Application(), HomeComponentProvider, ProfileComponentProvider {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerAppComponent.builder().utilsModule(UtilsModule(this)).build()

    }

    override fun provideHomeComponentFactory(): HomeComponent.Factory {
        return appComponent.homeComponentFactory()
    }

    override fun provideProfileComponentFactory(): ProfileComponent.Factory {
        return appComponent.profileComponentFactory()
    }
}
