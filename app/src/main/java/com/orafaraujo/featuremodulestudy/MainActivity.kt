package com.orafaraujo.featuremodulestudy

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.orafaraujo.features.navigations.IntentProvider

private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "onCreate")

        startActivity(IntentProvider.getHomeIntent(this))
        finish()
    }
}
