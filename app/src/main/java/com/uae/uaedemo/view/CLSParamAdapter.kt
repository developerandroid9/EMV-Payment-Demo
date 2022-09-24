package com.uae.uaedemo.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.uae.uaedemo.R
import com.uae.uaedemo.model.KernelViewData


class CLSParamAdapter(val list: List<KernelViewData>) :
    RecyclerView.Adapter<CLSParamAdapter.CLSParamAdapterViewHolder>() {

    inner class CLSParamAdapterViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        private val kernelIdTV: TextView = view.findViewById(R.id.kernelIdTV)
        private val cvmLimitTV: TextView = view.findViewById(R.id.cvmLimitTV)
        private val floorLimitTV: TextView = view.findViewById(R.id.floorLimitTV)
        private val transactionLimitTV: TextView = view.findViewById(R.id.transactionLimitTV)
        private val terminalCapabilityTV: TextView = view.findViewById(R.id.terminalCapabilityTV)
        private val additionalTerminalCapabilityTV: TextView = view.findViewById(R.id.additionalTerminalCapabilityTV)
        private val securityCapabilityTV: TextView = view.findViewById(R.id.securityCapabilityTV)
        private val tacDefaultTV: TextView = view.findViewById(R.id.tacDefaultTV)
        private val tacDenialTV: TextView = view.findViewById(R.id.tacDenialTV)
        private val tacOnlineTV: TextView = view.findViewById(R.id.tacOnlineTV)
        private val aidOptionTV: TextView = view.findViewById(R.id.aidOptionTV)
        private val tccTV: TextView = view.findViewById(R.id.tccTV)
        private val tdolTV: TextView = view.findViewById(R.id.tdolTV)
        private val languageSupportTV: TextView = view.findViewById(R.id.languageSupportTV)
        private val chipCVMReq: TextView = view.findViewById(R.id.chipCVMReq)
        private val cvmNotReq: TextView = view.findViewById(R.id.cvmNotReq)
        private val payPassUdolTV: TextView = view.findViewById(R.id.payPassUdolTV)
        private val kernelConfigurationTV: TextView = view.findViewById(R.id.kernelConfigurationTV)
        private val magStripeVersionTV: TextView = view.findViewById(R.id.magStripeVersionTV)
        private val magCVMreqTV: TextView = view.findViewById(R.id.magCVMreqTV)
        private val magCVMNotReqTV: TextView = view.findViewById(R.id.magCVMNotReqTV)
        private val clsLimitNODCVTV: TextView = view.findViewById(R.id.clsLimitNODCVTV)
        private val clsLmtDcvTV: TextView = view.findViewById(R.id.clsLmtDcvTV)
        private val riskManagementTV: TextView = view.findViewById(R.id.riskManagementTV)
        private val ailItemRV: RecyclerView = view.findViewById(R.id.ailItemRV)
        private val schemeTV: TextView = view.findViewById(R.id.schemeTV)

        fun bind(kernelViewData: KernelViewData) {
            schemeTV.text = kernelViewData.name
            kernelIdTV.text = kernelViewData.getKernelId(kernelViewData.kernelData) ?: "NA"
            cvmLimitTV.text = kernelViewData.getCVMLimit(kernelViewData.kernelData) ?: "NA"
            floorLimitTV.text = kernelViewData.getFloorLimit(kernelViewData.kernelData) ?: "NA"
            transactionLimitTV.text = kernelViewData.getTxnLimit(kernelViewData.kernelData) ?: "NA"
            terminalCapabilityTV.text =
                kernelViewData.getTerminalCapability(kernelViewData.kernelData) ?: "NA"
            additionalTerminalCapabilityTV.text =
                kernelViewData.getAddTerminalCapability(kernelViewData.kernelData) ?: "NA"
            securityCapabilityTV.text =
                kernelViewData.getSecurityCapability(kernelViewData.kernelData) ?: "NA"
            tacDefaultTV.text = kernelViewData.getDefaultTAC(kernelViewData.kernelData) ?: "NA"
            tacDenialTV.text = kernelViewData.getDenialTAC(kernelViewData.kernelData) ?: "NA"
            tacOnlineTV.text = kernelViewData.getOnlineTAC(kernelViewData.kernelData) ?: "NA"
            aidOptionTV.text = kernelViewData.getAidOption(kernelViewData.kernelData) ?: "NA"
            tccTV.text = kernelViewData.getTcc(kernelViewData.kernelData) ?: "NA"
            tdolTV.text = kernelViewData.getTdol(kernelViewData.kernelData) ?: "NA"
            languageSupportTV.text =
                kernelViewData.getSuppLanguage(kernelViewData.kernelData) ?: "NA"
            chipCVMReq.text =
                kernelViewData.getChipCVMCapabitlityReq(kernelViewData.kernelData) ?: "NA"
            cvmNotReq.text =
                kernelViewData.getChipCVMCapabitlityNotReq(kernelViewData.kernelData) ?: "NA"
            payPassUdolTV.text = kernelViewData.getPayPassUDOL(kernelViewData.kernelData) ?: "NA"
            kernelConfigurationTV.text =
                kernelViewData.getKernelConfiguration(kernelViewData.kernelData) ?: "NA"
            magStripeVersionTV.text =
                kernelViewData.getMagStripeVersion(kernelViewData.kernelData) ?: "NA"
            magCVMreqTV.text =
                kernelViewData.getMagStripeCVMCapabilityReq(kernelViewData.kernelData) ?: "NA"
            magCVMNotReqTV.text =
                kernelViewData.getMagStripeCVMCapabilityNotReq(kernelViewData.kernelData) ?: "NA"
            clsLimitNODCVTV.text =
                kernelViewData.getCLessLimitNoDCV(kernelViewData.kernelData) ?: "NA"
            clsLmtDcvTV.text = kernelViewData.getCLessLimitDCV(kernelViewData.kernelData) ?: "NA"
            riskManagementTV.text =
                kernelViewData.getRiskManagement(kernelViewData.kernelData) ?: "NA"
            val aidList = kernelViewData.getAidList(kernelViewData.kernelData)
            val clsAidAdapter = ClsAidAdapter(aidList)
            //val span = if ((aidList?.size ?: 0) >= 2) 2 else 1
            ailItemRV.adapter = clsAidAdapter
            ailItemRV.setHasFixedSize(false)
            val layoutManager = StaggeredGridLayoutManager(1, LinearLayoutManager.HORIZONTAL)

            ailItemRV.layoutManager = layoutManager
            ailItemRV.isNestedScrollingEnabled = false

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CLSParamAdapterViewHolder =
        CLSParamAdapterViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.cls_kernel_item, parent, false)
        )

    override fun onBindViewHolder(holder: CLSParamAdapterViewHolder, position: Int) =
        holder.bind(list[position])

    override fun getItemCount(): Int = list.size
}