package com.uae.uaedemo.repository.usecase

import com.uae.uaedemo.DataResource
import com.uae.uaedemo.model.Result
import com.uae.uaedemo.repository.UaeRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import java.io.IOException
import javax.inject.Inject

class GetUaeJsonData @Inject constructor(private val uaeRepository: UaeRepository) {

    operator fun invoke(): Flow<DataResource<Result>> = flow {
        try {
            emit(DataResource.Loading())
            val jsonData = uaeRepository.getJsonData()
            emit(DataResource.Success(jsonData))
        } catch (e: IOException) {
            emit(DataResource.Error(e.localizedMessage ?: "Unexpected Error"))
        }
    }

}