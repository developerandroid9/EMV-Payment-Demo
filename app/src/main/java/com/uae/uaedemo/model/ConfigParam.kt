package com.uae.uaedemo.model

import java.io.Serializable

data class ConfigParam(
    val adminPassword: String,
    val askRefundAuthCode: Boolean,
    val countryCode: String,
    val currencyCodeAlpha: String,
    val currencyCodeExponent: String,
    val currencyCodeNumeric: String,
    val defaultTransaction: String,
    val enableNol: Boolean,
    val encryptedSam: String,
    val helpDeskNumber: String,
    val isDCCEnabled: Boolean,
    val isLogUpload: Boolean,
    val isProgramdownload: Boolean,
    val maxPendingReversalCount: Int,
    val merchAdrL1: String,
    val merchAdrL2: String,
    val merchAdrL3: String,
    val merchCity: String,
    val merchCountry: String,
    val merchId: String,
    val merchName: String,
    val merchZipCode: String,
    val nolDeviceId: String,
    val samId: String,
    val screenLockPassword: String,
    val superVisorPassword: String,
    val termId: String
): Serializable