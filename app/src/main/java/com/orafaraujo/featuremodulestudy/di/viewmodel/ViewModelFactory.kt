package com.orafaraujo.featuremodulestudy.di.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import javax.inject.Inject
import javax.inject.Provider

@Suppress("UNCHECKED_CAST")
class ViewModelFactory @Inject constructor(
    @JvmSuppressWildcards private val viewModelsMap: Map<Class<out ViewModel>, Provider<ViewModel>>,
) :
    ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        val creator =
            viewModelsMap[modelClass]
                ?: viewModelsMap
                    .asIterable()
                    .firstOrNull { modelClass.isAssignableFrom(it.key) }
                    ?.value
                ?: error("ViewModelFactory could not find assignable class $modelClass")
        return creator.get() as T
    }
}