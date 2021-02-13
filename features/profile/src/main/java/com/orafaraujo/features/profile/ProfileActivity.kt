package com.orafaraujo.features.profile

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.orafaraujo.usecases.loadprofileapi.LoadProfileUseCase

private const val TAG = "ProfileActivity"

class ProfileActivity : AppCompatActivity() {

    // Inject it
    private lateinit var useCase: LoadProfileUseCase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        Log.d(TAG, "onCreate")

        val loadProfile = useCase.loadProfile(12)

        findViewById<Button>(R.id.go_to_home_button).setOnClickListener {
            // Go to home
        }

        findViewById<Button>(R.id.go_to_detail_button).setOnClickListener {
            // Go to detail
        }
    }
}
