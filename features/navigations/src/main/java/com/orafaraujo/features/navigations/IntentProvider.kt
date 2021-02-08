package com.orafaraujo.features.navigations

import android.content.Context
import android.content.Intent

object IntentProvider {

    fun getHomeIntent(context: Context) =
        internalIntent(context, "com.orafaraujo.featuremodulestudy.features.home")

    fun getDetailIntent(context: Context) =
        internalIntent(context, "com.orafaraujo.featuremodulestudy.features.detail")

    fun getProfileIntent(context: Context) =
        internalIntent(context, "com.orafaraujo.featuremodulestudy.features.profile")

    private fun internalIntent(context: Context, action: String) =
        Intent(action).setPackage(context.packageName)
}
