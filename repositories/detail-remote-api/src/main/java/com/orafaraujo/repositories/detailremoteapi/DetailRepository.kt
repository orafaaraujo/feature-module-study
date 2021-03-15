package com.orafaraujo.repositories.detailremoteapi

import com.orafaraujo.repositories.detailremoteapi.models.DetailResponse

interface DetailRepository {

    suspend fun fetchDetail(id: Long): DetailResponse
}
