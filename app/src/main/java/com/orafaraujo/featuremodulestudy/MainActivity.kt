package com.orafaraujo.featuremodulestudy

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.orafaraujo.shared.navigation.NavigationProvider
import org.koin.android.ext.android.inject

private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {

    private val navigationProvider by inject<NavigationProvider>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "onCreate")

        navigationProvider.provideHomeNavigation().openScreen()
    }
}
