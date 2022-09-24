package com.uae.uaedemo.model

import java.io.Serializable

data class Data(
    val KeyValueConfigParam: KeyValueConfigParam,
    val caKeyParam: CaKeyParam,
    val clsParam: ClsParam,
    val configParam: ConfigParam,
    val emvParam: EmvParam,
    val paramNOL: ParamNOL,
    val posComponents: PosComponents,
    val receiptParam: ReceiptParam,
    val tmsConnParam: TmsConnParam
): Serializable