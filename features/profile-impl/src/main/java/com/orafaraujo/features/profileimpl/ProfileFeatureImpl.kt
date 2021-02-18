package com.orafaraujo.features.profileimpl

import android.content.Context
import android.content.Intent
import android.util.Log
import com.orafaraujo.features.profileapi.ProfileFeature
import com.orafaraujo.features.profileimpl.view.ProfileActivity
import javax.inject.Inject

private const val TAG = "ProfileFeatureImpl";

class ProfileFeatureImpl @Inject constructor(private val context: Context) : ProfileFeature {

    override fun start(id: Long) {
        Log.d(TAG, "start() called with: id = [$id]")
        val intent = Intent(context, ProfileActivity::class.java)
            .apply {
                setPackage(context.packageName)
                addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                putExtra(ProfileActivity.EXTRA_PROFILE_ID, id)
            }
        context.startActivity(intent)
    }
}
