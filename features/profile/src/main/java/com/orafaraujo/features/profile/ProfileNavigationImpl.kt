package com.orafaraujo.features.profile

import android.content.Context
import android.content.Intent
import com.orafaraujo.shared.navigation.features.ProfileNavigation

class ProfileNavigationImpl(private val context: Context) : ProfileNavigation {

    override fun openScreen() {
        val intent = Intent(context, ProfileActivity::class.java)
            .setFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        context.startActivity(intent)
    }
}
