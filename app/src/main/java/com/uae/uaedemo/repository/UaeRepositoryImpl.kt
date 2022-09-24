package com.uae.uaedemo.repository

import android.content.Context
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.uae.uaedemo.model.Data
import com.uae.uaedemo.model.MainDataModel
import com.uae.uaedemo.model.Result
import com.uae.uaedemo.model.UaeWidgetDataModel
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.io.BufferedReader
import java.io.InputStreamReader
import javax.inject.Inject

class UaeRepositoryImpl @Inject constructor(private val context: Context,private val defaultDispatcher: CoroutineDispatcher = Dispatchers.Default) : UaeRepository {

//    private val mainListItem = arrayListOf(
//        "Config Param",
//        "EMV Param",
//        "CLS Param",
//        "CA Key Param",
//        "Receipt Param",
//        "TMS Connection Param",
//        "Key Value Config Param",
//        "Param Nol",
//        "POS Component"
//    )
    override suspend fun getJsonData() = withContext(defaultDispatcher ) {
        val sb = StringBuffer()
        val reader = BufferedReader(InputStreamReader(context.assets.open("task.json")))
        var s: String?
        s = reader.readLine()
        while (s != null) {
            sb.append(s)
            s = reader.readLine()
        }
        val json = sb.toString()
        val gson = Gson()
        val type = object : TypeToken<UaeWidgetDataModel>() {}.type
        val resultData: UaeWidgetDataModel = gson.fromJson(json, type)
        reader.close()
       resultData.result
    }
}