package com.uae.uaedemo.model

data class E11(
    val addTerminalCapability: String,
    val aidOption: String,
    val aids: List<KernelAid>,
    val cvmLimit: String,
    val defaultTAC: String,
    val denialTAC: String,
    val flrLimit: String,
    val kernelConfiguration: String,
    val kernelId: String,
    val onlineTAC: String,
    val suppLanguage: String,
    val tdol: String,
    val termFloorlimit: String,
    val terminalCapability: String,
    val ttq: String,
    val txnLimit: String,
    val versionNumber: String
)