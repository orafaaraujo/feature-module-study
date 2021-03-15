package com.orafaraujo.featuremodulestudy.di.features

import com.orafaraujo.features.detailapi.DetailFeature
import com.orafaraujo.features.detailimpl.DetailFeatureImpl
import com.orafaraujo.repositories.detailremoteapi.DetailRepository
import com.orafaraujo.repositories.detailremoteimpl.DetailRepositoryImpl
import com.orafaraujo.usecases.loaddetailapi.LoadDetailUseCase
import com.orafaraujo.usecases.loaddetailimpl.LoadDetailUseCaseImpl
import dagger.Binds
import dagger.Module

@Module
abstract class DetailModule {

    @Binds
    abstract fun provideFeature(detailFeatureImpl: DetailFeatureImpl): DetailFeature

    @Binds
    abstract fun provideUseCase(loadDetailUseCaseImpl: LoadDetailUseCaseImpl): LoadDetailUseCase

    @Binds
    abstract fun provideRepository(detailRepositoryImpl: DetailRepositoryImpl): DetailRepository
}
