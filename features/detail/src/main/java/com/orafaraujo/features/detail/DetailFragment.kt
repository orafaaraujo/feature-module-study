package com.orafaraujo.features.detail

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

private const val TAG = "DetailFragment"

class DetailFragment : Fragment(R.layout.fragment_detail) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d(TAG, "onCreate")

        view.findViewById<Button>(R.id.go_to_home_button).setOnClickListener {
            findNavController().navigate(R.id.action_detailFragment_to_HomeFragment)
        }

        view.findViewById<Button>(R.id.go_to_profile_button).setOnClickListener {
            findNavController().navigate(R.id.action_detailFragment_to_ProfileFragment)
        }
    }
}
