package com.orafaraujo.features.home

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.orafaraujo.shared.navigation.NavigationProvider
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

private const val TAG = "HomeActivity"

@AndroidEntryPoint
class HomeActivity : AppCompatActivity() {

    @Inject
    lateinit var navigationProvider: NavigationProvider

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        Log.d(TAG, "onCreate")

        findViewById<Button>(R.id.go_to_profile_button).setOnClickListener {
            navigationProvider.provideProfileNavigation().openScreen()
        }

        findViewById<Button>(R.id.go_to_detail_button).setOnClickListener {
            navigationProvider.provideDetailNavigation().openScreen()
        }
    }
}
