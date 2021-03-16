package com.orafaraujo.featuremodulestudy

import android.app.Application
import com.orafaraujo.featuremodulestudy.di.AppComponent
import com.orafaraujo.featuremodulestudy.di.AppModule
import com.orafaraujo.featuremodulestudy.di.DaggerAppComponent
import com.orafaraujo.features.detailimpl.di.DetailComponent
import com.orafaraujo.features.detailimpl.di.DetailComponentProvider
import com.orafaraujo.features.home.di.HomeComponent
import com.orafaraujo.features.home.di.HomeComponentProvider
import com.orafaraujo.features.profileimpl.di.ProfileComponent
import com.orafaraujo.features.profileimpl.di.ProfileComponentProvider

class MainApplication : Application(),
    HomeComponentProvider,
    ProfileComponentProvider,
    DetailComponentProvider {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerAppComponent.builder()
            .appModule(AppModule(this))
            .build()
    }

    override fun provideHomeComponentFactory(): HomeComponent.Factory {
        return appComponent.homeComponentFactory()
    }

    override fun provideProfileComponentFactory(): ProfileComponent.Factory {
        return appComponent.profileComponentFactory()
    }

    override fun provideDetailComponentFactory(): DetailComponent.Factory {
        return appComponent.detailComponentFactory()
    }
}
