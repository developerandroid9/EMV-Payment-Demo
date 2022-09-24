package com.uae.uaedemo.model

data class TmsConnParam(
    val gprsAuthPrimary: GprsAuthPrimary,
    val gprsAuthSecondary: GprsAuthSecondary,
    val gprsPrimary: GprsPrimary,
    val gprsSIM1: GprsSIM1,
    val gprsSIM2: GprsSIM2,
    val gprsSecondary: GprsSecondary,
    val tcpPrimary: TcpPrimary,
    val tcpSecondary: TcpSecondary,
    val thirdPartyApp: ThirdPartyApp,
    val tmsConnParamVersion: String,
    var list: ArrayList<Any> = arrayListOf()
)
{
    fun copyData()
    {
        list = ArrayList()
        list.add(gprsAuthPrimary)
        list.add(gprsAuthSecondary)
        list.add(gprsPrimary)
        list.add(gprsSIM1)
        list.add(gprsSIM2)
        list.add(gprsSecondary)
        list.add(tcpPrimary)
        list.add(tcpSecondary)
        list.add(thirdPartyApp)
    }
}