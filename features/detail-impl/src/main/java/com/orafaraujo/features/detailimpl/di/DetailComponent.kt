package com.orafaraujo.features.detailimpl.di

import com.orafaraujo.features.detailimpl.view.DetailActivity
import dagger.Subcomponent

@Subcomponent
interface DetailComponent {

    @Subcomponent.Factory
    interface Factory {
        fun create(): DetailComponent
    }

    fun inject(detailActivity: DetailActivity)
}

interface DetailComponentProvider {
    fun provideDetailComponentFactory(): DetailComponent.Factory
}
