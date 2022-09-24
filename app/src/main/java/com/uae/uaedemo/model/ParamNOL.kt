package com.uae.uaedemo.model

data class ParamNOL(
    val beId: String,
    val gprsPrimaryIp: String,
    val gprsPrimaryPort: String,
    val gprsSecondaryIp: String,
    val gprsSecondaryPort: String,
    val max: String,
    val mercuryBiN: String,
    val nolAid: String,
    val nolCardtypeItems: List<Any>,
    val offlineApprovedCountLimit: String,
    val offlineSingleTxnAmtLimit: String,
    val tcpPrimaryIp: String,
    val tcpPrimaryPort: String,
    val tcpSecondaryIp: String,
    val tcpSecondaryPort: String
)