package com.uae.uaedemo.model

data class ReceiptParam(
    val customer: Customer,
    val merchant: Merchant,
    val receiptParamVersion: String
)