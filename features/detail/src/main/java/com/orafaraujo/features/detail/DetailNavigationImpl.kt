package com.orafaraujo.features.detail

import android.content.Context
import android.content.Intent
import com.orafaraujo.shared.navigation.features.DetailNavigation
import dagger.hilt.android.qualifiers.ActivityContext
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

@ActivityScoped
class DetailNavigationImpl @Inject constructor(@ActivityContext private val context: Context) :
    DetailNavigation {

    override fun openScreen() {
        val intent = Intent(context, DetailActivity::class.java)
            .setFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        context.startActivity(intent)
    }
}
