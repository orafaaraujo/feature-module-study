package com.orafaraujo.features.detailimpl

import android.content.Context
import android.content.Intent
import android.util.Log
import com.orafaraujo.features.detailapi.DetailFeature
import com.orafaraujo.features.detailimpl.view.DetailActivity
import javax.inject.Inject

private const val TAG = "DetailFeatureImpl"

class DetailFeatureImpl @Inject constructor(private val context: Context) : DetailFeature {

    override fun start(id: Long) {
        Log.d(TAG, "start() called with: id = [$id]")
        val intent = Intent(context, DetailActivity::class.java)
            .apply {
                setPackage(context.packageName)
                addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                putExtra(DetailActivity.EXTRA_DETAIL_ID, id)
            }
        context.startActivity(intent)
    }
}
