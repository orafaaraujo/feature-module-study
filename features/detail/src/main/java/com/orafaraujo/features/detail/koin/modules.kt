package com.orafaraujo.features.detail.koin

import com.orafaraujo.features.detail.DetailNavigationImpl
import com.orafaraujo.shared.navigation.features.DetailNavigation
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val detailModule = module {

    factory<DetailNavigation> { DetailNavigationImpl(androidContext()) }
}
