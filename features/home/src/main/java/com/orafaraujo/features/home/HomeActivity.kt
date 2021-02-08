package com.orafaraujo.features.home

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.orafaraujo.features.navigations.IntentProvider

private const val TAG = "HomeActivity"

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        Log.d(TAG, "onCreate")

        findViewById<Button>(R.id.go_to_profile_button).setOnClickListener {
            startActivity(IntentProvider.getProfileIntent(this))
            finish()
        }

        findViewById<Button>(R.id.go_to_detail_button).setOnClickListener {
            startActivity(IntentProvider.getDetailIntent(this))
            finish()
        }
    }
}
