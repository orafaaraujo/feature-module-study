package com.orafaraujo.repositories.detailremoteimpl

import com.orafaraujo.repositories.detailremoteapi.DetailRepository
import com.orafaraujo.repositories.detailremoteapi.models.DetailResponse

class DetailRepositoryImpl : DetailRepository {

    override suspend fun fetchDetail(id: Long): DetailResponse {
        return DetailResponse(id = 0, name = "Detail of the response")
    }
}
