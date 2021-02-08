package com.orafaraujo.features.home

import android.content.Context
import android.content.Intent
import com.orafaraujo.shared.navigation.features.HomeNavigation

class HomeNavigationImpl(private val context: Context) : HomeNavigation {

    override fun openScreen() {
        val intent = Intent(context, HomeActivity::class.java)
            .setFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        context.startActivity(intent)
    }
}
