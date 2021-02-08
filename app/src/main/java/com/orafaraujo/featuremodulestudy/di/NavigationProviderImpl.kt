package com.orafaraujo.featuremodulestudy.di

import com.orafaraujo.shared.navigation.NavigationProvider
import com.orafaraujo.shared.navigation.features.DetailNavigation
import com.orafaraujo.shared.navigation.features.HomeNavigation
import com.orafaraujo.shared.navigation.features.ProfileNavigation
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

@ActivityScoped
class NavigationProviderImpl @Inject constructor(
    private val homeNavigation: HomeNavigation,
    private val detailNavigation: DetailNavigation,
    private val profileNavigation: ProfileNavigation
) : NavigationProvider {

    override fun provideHomeNavigation(): HomeNavigation = homeNavigation

    override fun provideDetailNavigation(): DetailNavigation = detailNavigation

    override fun provideProfileNavigation(): ProfileNavigation = profileNavigation
}
