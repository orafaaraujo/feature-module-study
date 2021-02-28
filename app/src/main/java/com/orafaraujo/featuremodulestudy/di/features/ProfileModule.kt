package com.orafaraujo.featuremodulestudy.di.features

import androidx.lifecycle.ViewModel
import com.orafaraujo.featuremodulestudy.di.viewmodel.ViewModelKey
import com.orafaraujo.features.profileapi.ProfileFeature
import com.orafaraujo.features.profileimpl.ProfileFeatureImpl
import com.orafaraujo.features.profileimpl.view.ProfileViewModel
import com.orafaraujo.repositories.profileapi.ProfileRepository
import com.orafaraujo.repositories.profileimpl.ProfileRepositoryImpl
import com.orafaraujo.usecases.loadprofileapi.LoadProfileUseCase
import com.orafaraujo.usecases.loadprofileimpl.LoadProfileUseCaseImpl
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ProfileModule {

    @Binds
    abstract fun provideRepository(profileRepositoryImpl: ProfileRepositoryImpl): ProfileRepository

    @Binds
    abstract fun provideUseCase(loadProfileUseCaseImpl: LoadProfileUseCaseImpl): LoadProfileUseCase

    @Binds
    @IntoMap
    @ViewModelKey(ProfileViewModel::class)
    abstract fun provideProfileViewModel(viewModel: ProfileViewModel): ViewModel

    @Binds
    abstract fun provideFeature(profileFeatureImpl: ProfileFeatureImpl): ProfileFeature

}
