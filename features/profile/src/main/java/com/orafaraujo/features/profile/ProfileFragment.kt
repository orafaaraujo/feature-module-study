package com.orafaraujo.features.profile

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

private const val TAG = "ProfileFragment"

class ProfileFragment : Fragment(R.layout.fragment_profile) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d(TAG, "onCreate")

        view.findViewById<Button>(R.id.go_to_home_button).setOnClickListener {
            findNavController().navigate(R.id.action_profileFragment_to_homeFragment)
        }

        view.findViewById<Button>(R.id.go_to_detail_button).setOnClickListener {
            findNavController().navigate(R.id.action_profileFragment_to_detailFragment)
        }
    }
}
