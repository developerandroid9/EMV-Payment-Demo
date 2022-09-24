package com.uae.uaedemo.model

data class KernelViewData(val kernelData: Any, val name: String)
{
    fun getKernelId(kernelData: Any): String?
    {
        return when (kernelData) {
            is Visa -> kernelData.kernelId
            is Master -> kernelData.kernelId
            is Maestro -> kernelData.kernelId
            is E11 -> kernelData.kernelId
            else -> null
        }
    }
    fun getFloorLimit(kernelData: Any): String?
    {
        return when (kernelData) {
            is Visa -> kernelData.flrLimit
            is Master -> kernelData.flrLimit
            is Maestro -> kernelData.flrLimit
            is E11 -> kernelData.flrLimit
            else -> null
        }
    }
    fun getCVMLimit(kernelData: Any): String?
    {
        return when (kernelData) {
            is Visa -> kernelData.cvmLimit
            is Master -> kernelData.cvmLimit
            is Maestro -> kernelData.cvmLimit
            is E11 -> kernelData.cvmLimit
            else -> null
        }
    }
    fun getTxnLimit(kernelData: Any): String?
    {
        return when (kernelData) {
            is Visa -> kernelData.txnLimit
            is Master -> kernelData.txnLimit
            is Maestro -> kernelData.txnLimit
            is E11 -> kernelData.txnLimit
            else -> null
        }
    }
    fun getTerminalCapability(kernelData: Any): String?
    {
        return when (kernelData) {
            is Visa -> kernelData.terminalCapability
            is Master -> kernelData.terminalCapability
            is Maestro -> kernelData.terminalCapability
            is E11 -> kernelData.terminalCapability
            else -> null
        }
    }
    fun getAddTerminalCapability(kernelData: Any): String?
    {
        return when (kernelData) {
            is Visa -> kernelData.addTerminalCapability
            is Master -> kernelData.addTerminalCapability
            is Maestro -> kernelData.addTerminalCapability
            is E11 -> kernelData.addTerminalCapability
            else -> null
        }
    }
    fun getSecurityCapability(kernelData: Any): String?
    {
        return when (kernelData) {

            is Master -> kernelData.securityCapability
            is Maestro -> kernelData.securityCapability

            else -> null
        }
    }
    fun getDefaultTAC(kernelData: Any): String?
    {
        return when (kernelData) {
            is Visa -> kernelData.defaultTAC
            is E11 -> kernelData.defaultTAC
            is Master -> kernelData.defaultTAC
            is Maestro -> kernelData.defaultTAC

            else -> null
        }
    }
    fun getDenialTAC(kernelData: Any): String?
    {
        return when (kernelData) {
            is Visa -> kernelData.denialTAC
            is E11 -> kernelData.denialTAC
            is Master -> kernelData.denialTAC
            is Maestro -> kernelData.denialTAC

            else -> null
        }
    }
    fun getOnlineTAC(kernelData: Any): String?
    {
        return when (kernelData) {
            is Visa -> kernelData.onlineTAC
            is E11 -> kernelData.onlineTAC
            is Master -> kernelData.onlineTAC
            is Maestro -> kernelData.onlineTAC

            else -> null
        }
    }
    fun getAidOption(kernelData: Any): String?
    {
        return when (kernelData) {
            is Visa -> null
            is E11 -> kernelData.aidOption
            is Master -> kernelData.aidOption
            is Maestro -> kernelData.aidOption

            else -> null
        }
    }
    fun getTcc(kernelData: Any): String?
    {
        return when (kernelData) {
            is Visa -> null
            is E11 -> null
            is Master -> kernelData.tcc
            is Maestro -> kernelData.tcc

            else -> null
        }
    }
    fun getTdol(kernelData: Any): String?
    {
        return when (kernelData) {
            is Visa -> kernelData.tdol
            is E11 -> kernelData.tdol
            is Master -> kernelData.tdol
            is Maestro -> kernelData.tdol

            else -> null
        }
    }
    fun getSuppLanguage(kernelData: Any): String?
    {
        return when (kernelData) {
            is Visa -> null
            is E11 -> kernelData.suppLanguage
            is Master -> kernelData.suppLanguage
            is Maestro -> kernelData.suppLanguage

            else -> null
        }
    }
    fun getCardDataInputCap(kernelData: Any): String?
    {
        return when (kernelData) {
            is Visa -> null
            is E11 -> null
            is Master -> kernelData.cardDataInputCap
            is Maestro -> kernelData.cardDataInputCap
            else -> null
        }
    }
    fun getChipCVMCapabitlityReq(kernelData: Any): String?
    {
        return when (kernelData) {
            is Visa -> null
            is E11 -> null
            is Master -> kernelData.chipCVMCapabitlityReq
            is Maestro -> kernelData.chipCVMCapabitlityReq

            else -> null
        }
    }

    fun getChipCVMCapabitlityNotReq(kernelData: Any): String?
    {
        return when (kernelData) {
            is Visa -> null
            is E11 -> null
            is Master -> kernelData.chipCVMCapabitlityNotReq
            is Maestro -> kernelData.chipCVMCapabitlityNotReq

            else -> null
        }
    }
    fun getPayPassUDOL(kernelData: Any): String?
    {
        return when (kernelData) {
            is Visa -> null
            is E11 -> null
            is Master -> kernelData.payPassUDOL
            is Maestro -> kernelData.payPassUDOL

            else -> null
        }
    }

    fun getKernelConfiguration(kernelData: Any): String?
    {
        return when (kernelData) {
            is Visa -> kernelData.kernelConfiguration
            is E11 -> kernelData.kernelConfiguration
            is Master -> kernelData.kernelConfiguration
            is Maestro -> kernelData.kernelConfiguration

            else -> null
        }
    }

    fun getMagStripeVersion(kernelData: Any): String?
    {
        return when (kernelData) {
            is Visa -> null
            is E11 -> null
            is Master -> kernelData.magStripeVersion
            is Maestro -> kernelData.magStripeVersion

            else -> null
        }
    }
    fun getMagStripeCVMCapabilityReq(kernelData: Any): String?
    {
        return when (kernelData) {
            is Visa -> null
            is E11 -> null
            is Master -> kernelData.magStripeCVMCapabilityReq
            is Maestro -> kernelData.magStripeCVMCapabilityReq

            else -> null
        }
    }
    fun getMagStripeCVMCapabilityNotReq(kernelData: Any): String?
    {
        return when (kernelData) {
            is Visa -> null
            is E11 -> null
            is Master -> kernelData.magStripeCVMCapabilityNotReq
            is Maestro -> kernelData.magStripeCVMCapabilityNotReq

            else -> null
        }
    }
    fun getCLessLimitNoDCV(kernelData: Any): String?
    {
        return when (kernelData) {
            is Visa -> null
            is E11 -> null
            is Master -> kernelData.cLessLimitNoDCV
            is Maestro -> kernelData.cLessLimitNoDCV

            else -> null
        }
    }
    fun getCLessLimitDCV(kernelData: Any): String?
    {
        return when (kernelData) {
            is Visa -> null
            is E11 -> null
            is Master -> kernelData.cLessLimitDCV
            is Maestro -> kernelData.cLessLimitDCV

            else -> null
        }
    }
    fun getRiskManagement(kernelData: Any): String?
    {
        return when (kernelData) {
            is Visa -> kernelData.riskManagement
            is E11 -> null
            is Master -> kernelData.riskManagement
            is Maestro -> kernelData.riskManagement

            else -> null
        }
    }

    fun getAidList(kernelData: Any):List<KernelAid>?  {
        return when (kernelData) {
            is Visa -> kernelData.aids
            is E11 -> kernelData.aids
            is Master -> kernelData.aids
            is Maestro -> kernelData.aids

            else -> null
        }
    }
}
