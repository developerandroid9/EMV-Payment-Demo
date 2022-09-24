package com.uae.uaedemo.model

import java.io.Serializable

data class EmvParam(
    val aids: List<AidListItem>,
    val emvGeneralParam: EmvGeneralParam,
    val emvVersion: String
): Serializable