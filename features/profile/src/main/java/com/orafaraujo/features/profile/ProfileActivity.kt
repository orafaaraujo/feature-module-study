package com.orafaraujo.features.profile

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.gaelmarhic.quadrant.QuadrantConstants

private const val TAG = "ProfileActivity";

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        Log.d(TAG, "onCreate")

        findViewById<Button>(R.id.go_to_home_button).setOnClickListener {
            val intent = Intent().setClassName(this, QuadrantConstants.HOME_ACTIVITY)
            startActivity(intent)
            finish()
        }

        findViewById<Button>(R.id.go_to_detail_button).setOnClickListener {
            val intent = Intent().setClassName(this, QuadrantConstants.DETAIL_ACTIVITY)
            startActivity(intent)
            finish()
        }
    }
}
