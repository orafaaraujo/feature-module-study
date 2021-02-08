package com.orafaraujo.featuremodulestudy.koin

import com.orafaraujo.featuremodulestudy.navigation.NavigationProviderImpl
import com.orafaraujo.shared.navigation.NavigationProvider
import org.koin.dsl.module

val appModule = module {

    single<NavigationProvider> { NavigationProviderImpl(get(), get(), get()) }
}
