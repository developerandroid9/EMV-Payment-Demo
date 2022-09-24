package com.uae.uaedemo.model

import java.io.Serializable

data class EmvGeneralParam(
    val countryCode: String,
    val extAddTermCapability: String,
    val merchCategoryCode: String,
    val merchId: String,
    val merchName: String,
    val operatorName: String,
    val referCurrCode: String,
    val referCurrCon: String,
    val referCurrExp: String,
    val termId: String,
    val termNo: String,
    val termType: String,
    val terminalCapability: String,
    val transCurrCode: String,
    val transCurrExp: String
): Serializable