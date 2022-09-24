package com.uae.uaedemo.model

data class Visa(
    val addTerminalCapability: String,
    val aids: List<KernelAid>,
    val cvmLimit: String,
    val dccctlessratelookupamt: String,
    val defaultTAC: String,
    val denialTAC: String,
    val flrLimit: String,
    val kernelConfiguration: String,
    val kernelId: String,
    val onlineTAC: String,
    val riskManagement: String,
    val tdol: String,
    val terminalCapability: String,
    val terminalSuppLang: String,
    val ttq: String,
    val txnLimit: String,
    val zeroAmountFlag: String
)