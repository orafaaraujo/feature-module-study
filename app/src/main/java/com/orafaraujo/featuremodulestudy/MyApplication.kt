package com.orafaraujo.featuremodulestudy

import android.app.Application
import com.orafaraujo.featuremodulestudy.koin.appModule
import com.orafaraujo.features.detail.koin.detailModule
import com.orafaraujo.features.home.koin.homeModule
import com.orafaraujo.features.profile.koin.profileModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger()
            androidContext(this@MyApplication)
            modules(
                homeModule,
                detailModule,
                profileModule,
                appModule
            )
        }
    }
}
