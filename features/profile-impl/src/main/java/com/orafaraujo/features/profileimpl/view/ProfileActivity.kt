package com.orafaraujo.features.profileimpl.view

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.orafaraujo.features.profileapi.models.ProfilePresentationModel
import com.orafaraujo.features.profileimpl.R
import com.orafaraujo.features.profileimpl.di.ProfileComponentProvider
import kotlinx.coroutines.flow.collect
import javax.inject.Inject

private const val TAG = "ProfileActivity"

class ProfileActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModelProvider: ViewModelProvider.Factory

    private val viewModel by viewModels<ProfileViewModel> { viewModelProvider  }

    override fun onCreate(savedInstanceState: Bundle?) {
        getComponent().inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        Log.d(TAG, "onCreate")

        viewModel.loadProfile(0)
        lifecycleScope.launchWhenStarted {
            viewModel.states.collect { state ->
                when (state) {
                    is ProfileStates.Loading -> onLoadingState()
                    is ProfileStates.Error -> onErrorState(state.message)
                    is ProfileStates.Success -> onSuccessState(state.presentationObject)
                }
            }
        }

        findViewById<Button>(R.id.go_to_home_button).setOnClickListener {
            // Go to home
        }

        findViewById<Button>(R.id.go_to_detail_button).setOnClickListener {
            // Go to detail
        }
    }

    private fun onErrorState(message: String?) {
        Log.d(TAG, "onErrorState() called with: message = [$message]")
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    private fun onLoadingState() {
        Log.d(TAG, "onLoadingState() called")
        // Show loading
    }

    private fun onSuccessState(profile: ProfilePresentationModel) {
        Log.d(TAG, "onSuccessState() called with: profile = [$profile]")
        Toast.makeText(this, profile.name, Toast.LENGTH_SHORT).show()
    }

    companion object {
        internal const val EXTRA_PROFILE_ID = "EXTRA_PROFILE_ID"
    }
}


private fun ProfileActivity.getComponent() = (application as ProfileComponentProvider)
    .provideProfileComponentFactory()
    .create()

