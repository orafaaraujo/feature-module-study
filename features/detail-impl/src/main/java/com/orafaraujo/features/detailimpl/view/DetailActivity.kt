package com.orafaraujo.features.detailimpl.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.orafaraujo.features.detailimpl.R

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
    }

    companion object {
        internal const val EXTRA_DETAIL_ID = "EXTRA_DETAIL_ID"
    }
}
