package com.orafaraujo.usecases.loaddetailimpl.mapper

import com.orafaraujo.repositories.detailremoteapi.models.DetailResponse
import com.orafaraujo.usecases.loaddetailapi.model.DetailDTO
import javax.inject.Inject

class LoadDetailUseCaseMapper @Inject constructor() {

    fun toModel(response: DetailResponse): DetailDTO =
        DetailDTO(name = response.name)
}
