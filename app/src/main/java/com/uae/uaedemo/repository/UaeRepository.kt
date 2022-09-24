package com.uae.uaedemo.repository

import com.uae.uaedemo.model.Result


interface UaeRepository {
    suspend fun getJsonData(): Result
}