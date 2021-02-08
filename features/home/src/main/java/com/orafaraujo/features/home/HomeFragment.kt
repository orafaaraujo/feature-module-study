package com.orafaraujo.features.home

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

private const val TAG = "HomeFragment"

class HomeFragment : Fragment(R.layout.fragment_home) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d(TAG, "onCreate")

        view.findViewById<Button>(R.id.go_to_profile_button).setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_ProfileFragment)
        }

        view.findViewById<Button>(R.id.go_to_detail_button).setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_DetailFragment)
        }
    }
}
