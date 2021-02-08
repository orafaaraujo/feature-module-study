package com.orafaraujo.features.detail

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.gaelmarhic.quadrant.QuadrantConstants

private const val TAG = "DetailActivity"

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        Log.d(TAG, "onCreate")

        findViewById<Button>(R.id.go_to_home_button).setOnClickListener {
            val intent = Intent().setClassName(this, QuadrantConstants.HOME_ACTIVITY)
            startActivity(intent)
            finish()
        }

        findViewById<Button>(R.id.go_to_profile_button).setOnClickListener {
            val intent = Intent().setClassName(this, QuadrantConstants.PROFILE_ACTIVITY)
            startActivity(intent)
            finish()
        }
    }
}
