package com.orafaraujo.features.profileimpl

import android.content.Context
import android.content.Intent
import com.orafaraujo.features.profileapi.ProfileFeature
import com.orafaraujo.features.profileimpl.view.ProfileActivity

class ProfileFeatureImpl(private val context: Context) : ProfileFeature {

    override fun start(id: Long) {
        val intent = Intent(context, ProfileActivity::class.java)
            .apply {
                setPackage(context.packageName)
                addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                putExtra(ProfileActivity.EXTRA_PROFILE_ID, id)
            }
        context.startActivity(intent)
    }
}
