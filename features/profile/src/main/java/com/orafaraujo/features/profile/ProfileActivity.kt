package com.orafaraujo.features.profile

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.orafaraujo.features.navigations.IntentProvider

private const val TAG = "ProfileActivity";

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        Log.d(TAG, "onCreate")

        findViewById<Button>(R.id.go_to_home_button).setOnClickListener {
            startActivity(IntentProvider.getHomeIntent(this))
            finish()
        }

        findViewById<Button>(R.id.go_to_detail_button).setOnClickListener {
            startActivity(IntentProvider.getDetailIntent(this))
            finish()
        }
    }
}
