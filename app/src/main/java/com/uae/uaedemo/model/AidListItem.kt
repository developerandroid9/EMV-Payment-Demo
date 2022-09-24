package com.uae.uaedemo.model

import java.io.Serializable

data class AidListItem(
    val DDOL: String,
    val TDOL: String,
    val acquierId: String,
    val aidName: String,
    val floorLimit: String,
    val floorLimitCheck: String,
    val maxTargetPer: String,
    val randTransSel: String,
    val riskManageData: String,
    val selFlag: String,
    val tacDefault: String,
    val tacDenial: String,
    val tacOnline: String,
    val targetPer: String,
    val threshold: String,
    val velocityCheck: String,
    val version: String,
    val vlpFlg: String,
    val vlpVal: String
): Serializable