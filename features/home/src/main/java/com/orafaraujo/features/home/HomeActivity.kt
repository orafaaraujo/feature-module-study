package com.orafaraujo.features.home

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.orafaraujo.features.detailapi.DetailFeature
import com.orafaraujo.features.home.di.HomeComponentProvider
import com.orafaraujo.features.profileapi.ProfileFeature
import javax.inject.Inject

private const val TAG = "HomeActivity"

class HomeActivity : AppCompatActivity() {

    @Inject
    lateinit var profileFeature: ProfileFeature

    @Inject
    lateinit var detailFeature: DetailFeature

    override fun onCreate(savedInstanceState: Bundle?) {
        getComponent().inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        Log.d(TAG, "onCreate")

        findViewById<Button>(R.id.go_to_profile_button).setOnClickListener {
            profileFeature.start(0)
        }

        findViewById<Button>(R.id.go_to_detail_button).setOnClickListener {
            detailFeature.start(0)
        }
    }
}

private fun HomeActivity.getComponent() = (application as HomeComponentProvider)
    .provideHomeComponentFactory()
    .create()
