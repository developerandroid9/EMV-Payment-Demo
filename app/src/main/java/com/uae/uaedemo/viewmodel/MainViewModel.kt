package com.uae.uaedemo.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.uae.uaedemo.DataResource
import com.uae.uaedemo.repository.usecase.GetUaeJsonData
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val getUaeJsonData: GetUaeJsonData) : ViewModel() {
    private val _uiState = MutableStateFlow(UaeDataState())
    val uiState: StateFlow<UaeDataState> = _uiState


    init {
        uaeJson()
    }

    private  fun uaeJson() {
        getUaeJsonData().onEach { result ->
            when (result) {
                is DataResource.Success -> {
                    result.data?.data?.clsParam?.copyData()
                    result.data?.data?.tmsConnParam?.copyData()
                    _uiState.value=UaeDataState(result= result.data)
                }
                is DataResource.Loading -> {
                    _uiState.value=UaeDataState(isLoading= true)
                }
                is DataResource.Error -> {
                    _uiState.value=UaeDataState(error = result.message)
                }
            }
        }.launchIn(viewModelScope)
    }


}