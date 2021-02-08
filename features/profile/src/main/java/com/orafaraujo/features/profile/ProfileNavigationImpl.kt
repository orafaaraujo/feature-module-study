package com.orafaraujo.features.profile

import android.content.Context
import android.content.Intent
import com.orafaraujo.shared.navigation.features.ProfileNavigation
import dagger.hilt.android.qualifiers.ActivityContext
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

@ActivityScoped
class ProfileNavigationImpl @Inject constructor(@ActivityContext private val context: Context) :
    ProfileNavigation {

    override fun openScreen() {
        val intent = Intent(context, ProfileActivity::class.java)
            .setFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        context.startActivity(intent)
    }
}
