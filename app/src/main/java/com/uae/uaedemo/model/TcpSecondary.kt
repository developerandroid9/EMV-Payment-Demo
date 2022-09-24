package com.uae.uaedemo.model

data class TcpSecondary(
    val connRetryCnt: String,
    val connTimeout: String,
    val ip: String,
    val isSSL: Boolean,
    val isSSLCaching: Boolean,
    val port: String,
    val responseTimeout: String
)