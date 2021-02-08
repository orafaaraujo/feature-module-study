package com.orafaraujo.shared.navigation

import com.orafaraujo.shared.navigation.features.DetailNavigation
import com.orafaraujo.shared.navigation.features.HomeNavigation
import com.orafaraujo.shared.navigation.features.ProfileNavigation

interface NavigationProvider {

    fun provideHomeNavigation(): HomeNavigation

    fun provideDetailNavigation(): DetailNavigation

    fun provideProfileNavigation(): ProfileNavigation
}
