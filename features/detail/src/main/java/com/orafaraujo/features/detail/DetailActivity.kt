package com.orafaraujo.features.detail

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.orafaraujo.shared.navigation.NavigationProvider
import org.koin.android.ext.android.inject

private const val TAG = "DetailActivity"

class DetailActivity : AppCompatActivity() {

    private val navigationProvider by inject<NavigationProvider>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        Log.d(TAG, "onCreate")

        findViewById<Button>(R.id.go_to_home_button).setOnClickListener {
            navigationProvider.provideHomeNavigation().openScreen()
        }

        findViewById<Button>(R.id.go_to_profile_button).setOnClickListener {
            navigationProvider.provideHomeNavigation().openScreen()
        }
    }
}
