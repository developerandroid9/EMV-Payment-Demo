package com.uae.uaedemo.viewmodel

import com.uae.uaedemo.model.Result

data class UaeDataState(
    val isLoading: Boolean = false,
    val result: Result? = null,
    val error: String? = null,
)

