package com.orafaraujo.usecases.loaddetailapi

import com.orafaraujo.usecases.loaddetailapi.model.DetailDTO

interface LoadDetailUseCase {

    suspend fun loadDetail(id: Long): DetailDTO
}
