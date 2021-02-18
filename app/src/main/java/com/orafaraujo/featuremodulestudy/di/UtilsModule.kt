package com.orafaraujo.featuremodulestudy.di

import android.content.Context
import dagger.Module
import dagger.Provides

@Module
class UtilsModule(private val ctx: Context) {

    @Provides
    fun provideApplicationContext(): Context = ctx

}
