package com.uae.uaedemo.model

data class ClsParam(
    val clsTerminal: ClsTerminal,
    val clsVersion: String,
    val kernel: Kernel,
    var kernelDataList : ArrayList<KernelViewData> = arrayListOf()
) {
    fun copyData() {
        kernelDataList=arrayListOf()
        kernelDataList.add(KernelViewData(kernel.visa,"Visa"))
        kernelDataList.add(KernelViewData(kernel.master,"Master"))
        kernelDataList.add(KernelViewData(kernel.maestro,"Mestro"))
        kernelDataList.add(KernelViewData(kernel.e11,"E11"))
    }
}
