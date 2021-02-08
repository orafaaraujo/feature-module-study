package com.orafaraujo.features.profile.koin

import com.orafaraujo.features.profile.ProfileNavigationImpl
import com.orafaraujo.shared.navigation.features.ProfileNavigation
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val profileModule = module {

    factory<ProfileNavigation> { ProfileNavigationImpl(androidContext()) }
}
