package com.orafaraujo.usecases.loaddetailimpl

import com.orafaraujo.repositories.detailremoteapi.DetailRepository
import com.orafaraujo.usecases.loaddetailapi.LoadDetailUseCase
import com.orafaraujo.usecases.loaddetailapi.model.DetailDTO
import com.orafaraujo.usecases.loaddetailimpl.mapper.LoadDetailUseCaseMapper
import javax.inject.Inject

class LoadDetailUseCaseImpl @Inject constructor(
    private val repository: DetailRepository,
    private val mapper: LoadDetailUseCaseMapper
) : LoadDetailUseCase {

    override suspend fun loadDetail(id: Long): DetailDTO {
        val profile = repository.fetchDetail(id)
        return mapper.toModel(profile)
    }
}
