package com.orafaraujo.featuremodulestudy

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.gaelmarhic.quadrant.QuadrantConstants

private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "onCreate")

        val intent = Intent().setClassName(this, QuadrantConstants.HOME_ACTIVITY)
        startActivity(intent)
        finish()
    }
}
