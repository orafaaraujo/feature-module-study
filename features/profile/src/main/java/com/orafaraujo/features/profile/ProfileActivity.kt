package com.orafaraujo.features.profile

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.orafaraujo.shared.navigation.NavigationProvider
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

private const val TAG = "ProfileActivity";

@AndroidEntryPoint
class ProfileActivity : AppCompatActivity() {

    @Inject
    lateinit var navigationProvider: NavigationProvider

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        Log.d(TAG, "onCreate")

        findViewById<Button>(R.id.go_to_home_button).setOnClickListener {
            navigationProvider.provideHomeNavigation().openScreen()
        }

        findViewById<Button>(R.id.go_to_detail_button).setOnClickListener {
            navigationProvider.provideDetailNavigation().openScreen()
        }
    }
}
