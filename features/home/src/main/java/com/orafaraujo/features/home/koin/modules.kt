package com.orafaraujo.features.home.koin

import com.orafaraujo.features.home.HomeNavigationImpl
import com.orafaraujo.shared.navigation.features.HomeNavigation
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val homeModule = module {

    factory<HomeNavigation> { HomeNavigationImpl(androidContext()) }
}
