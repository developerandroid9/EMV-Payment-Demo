package com.uae.uaedemo.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.switchmaterial.SwitchMaterial
import com.uae.uaedemo.R
import com.uae.uaedemo.model.*

class TmsConnectionAdapter(val list: List<Any>) :
    RecyclerView.Adapter<TmsConnectionAdapter.TmsConnectionViewHolder>() {

    inner class TmsConnectionViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        private val headerNameTV: TextView = view.findViewById(R.id.headerNameTV)
        private val ipHeadingTV: TextView = view.findViewById(R.id.ipHeadingTV)
        private val ipTV: TextView = view.findViewById(R.id.ipTV)
        private val portHeadingTV: TextView = view.findViewById(R.id.portHeadingTV)
        private val portTV: TextView = view.findViewById(R.id.portTV)
        private val connectionTimeOutHeadingTV: TextView =
            view.findViewById(R.id.connectionTimeOutHeadingTV)
        private val connectionTimeoutTV: TextView = view.findViewById(R.id.connectionTimeoutTV)
        private val responseTimeOutHeadingTV: TextView =
            view.findViewById(R.id.responseTimeOutHeadingTV)
        private val responseTimeoutTV: TextView = view.findViewById(R.id.responseTimeoutTV)
        private val retryTimeOutHeadingTV: TextView = view.findViewById(R.id.retryTimeOutHeadingTV)
        private val retryTimeoutTV: TextView = view.findViewById(R.id.retryTimeoutTV)
        private val sslSM: SwitchMaterial = view.findViewById(R.id.sslSM)
        private val isSSLChachingSM: SwitchMaterial = view.findViewById(R.id.isSSLChachingSM)
        fun bind(any: Any) {
            if (any is GprsPrimary) {
                headerNameTV.text = view.context.getString(R.string.gprs_primary)
                ipHeadingTV.text = view.context.getString(R.string.ip)
                ipTV.text = any.ip
                portHeadingTV.text = view.context.getString(R.string.port)
                portTV.text = any.port
                connectionTimeOutHeadingTV.text =
                    view.context.getString(R.string.connection_time_out)
                connectionTimeoutTV.text = any.connTimeout

                responseTimeOutHeadingTV.text = view.context.getString(R.string.response_time_out)
                responseTimeoutTV.text = any.responseTimeout
                sslSM.text = view.context.getString(R.string.is_ssl_enabled)
                sslSM.isChecked = any.isSSL
                isSSLChachingSM.text = view.context.getString(R.string.is_ssl_chaching_enabled)
                isSSLChachingSM.isChecked = any.isSSLCaching
                isSSLChachingSM.visibility = View.VISIBLE
                retryTimeOutHeadingTV.visibility = View.VISIBLE
                retryTimeoutTV.visibility = View.VISIBLE

            }
            if (any is GprsSecondary) {
                headerNameTV.text = view.context.getString(R.string.gprs_secondary)
                ipHeadingTV.text = view.context.getString(R.string.ip)
                ipTV.text = any.ip
                portHeadingTV.text = view.context.getString(R.string.port)
                portTV.text = any.port
                connectionTimeOutHeadingTV.text =
                    view.context.getString(R.string.connection_time_out)
                connectionTimeoutTV.text = any.connTimeout
                responseTimeOutHeadingTV.text = view.context.getString(R.string.response_time_out)
                responseTimeoutTV.text = any.responseTimeout
                retryTimeOutHeadingTV.text = view.context.getString(R.string.retry_count)
                retryTimeoutTV.text = any.connRetryCnt
                sslSM.text = view.context.getString(R.string.is_ssl_enabled)
                sslSM.isChecked = any.isSSL
                isSSLChachingSM.text = view.context.getString(R.string.is_ssl_chaching_enabled)
                isSSLChachingSM.isChecked = any.isSSLCaching
                isSSLChachingSM.visibility = View.VISIBLE
                retryTimeOutHeadingTV.visibility = View.VISIBLE
                retryTimeoutTV.visibility = View.VISIBLE
            }
            if (any is GprsSIM1) {
                headerNameTV.text = view.context.getString(R.string.gprs_sim1)
                ipHeadingTV.text = view.context.getString(R.string.apn)
                ipTV.text = any.apn
                portHeadingTV.text = view.context.getString(R.string.user_name)
                portTV.text = any.userName
                connectionTimeOutHeadingTV.text =
                    view.context.getString(R.string.password)
                connectionTimeoutTV.text = any.password
                responseTimeOutHeadingTV.text = view.context.getString(R.string.priorty)
                responseTimeoutTV.text = any.priority
                sslSM.text = view.context.getString(R.string.is_sim1_enabled)
                sslSM.isChecked = any.isEnable
                isSSLChachingSM.visibility = View.GONE
                retryTimeOutHeadingTV.visibility = View.GONE
                retryTimeoutTV.visibility = View.GONE
            }
            if (any is GprsSIM2) {
                headerNameTV.text = view.context.getString(R.string.gprs_sim2)
                ipHeadingTV.text = view.context.getString(R.string.apn)
                ipTV.text = any.apn
                portHeadingTV.text = view.context.getString(R.string.user_name)
                portTV.text = any.userName
                connectionTimeOutHeadingTV.text =
                    view.context.getString(R.string.password)
                connectionTimeoutTV.text = any.password

                responseTimeOutHeadingTV.text = view.context.getString(R.string.priorty)
                responseTimeoutTV.text = any.priority
                sslSM.text = view.context.getString(R.string.is_sim2_enabled)
                sslSM.isChecked = any.isEnable
                isSSLChachingSM.visibility = View.GONE
                retryTimeOutHeadingTV.visibility = View.GONE
                retryTimeoutTV.visibility = View.GONE
            }
            if (any is TcpPrimary) {
                headerNameTV.text = view.context.getString(R.string.tcp_primary)
                ipHeadingTV.text = view.context.getString(R.string.ip)
                ipTV.text = any.ip
                portHeadingTV.text = view.context.getString(R.string.port)
                portTV.text = any.port
                connectionTimeOutHeadingTV.text =
                    view.context.getString(R.string.connection_time_out)
                connectionTimeoutTV.text = any.connTimeout
                responseTimeOutHeadingTV.text = view.context.getString(R.string.response_time_out)
                responseTimeoutTV.text = any.responseTimeout
                retryTimeOutHeadingTV.text = view.context.getString(R.string.retry_count)
                retryTimeoutTV.text = any.connRetryCnt
                sslSM.text = view.context.getString(R.string.is_ssl_enabled)
                sslSM.isChecked = any.isSSL
                isSSLChachingSM.text = view.context.getString(R.string.is_ssl_chaching_enabled)
                isSSLChachingSM.isChecked = any.isSSLCaching
                isSSLChachingSM.visibility = View.VISIBLE
                retryTimeOutHeadingTV.visibility = View.VISIBLE
                retryTimeoutTV.visibility = View.VISIBLE
            }
            if (any is TcpSecondary) {
                headerNameTV.text = view.context.getString(R.string.tcp_secondary)
                ipHeadingTV.text = view.context.getString(R.string.ip)
                ipTV.text = any.ip
                portHeadingTV.text = view.context.getString(R.string.port)
                portTV.text = any.port
                connectionTimeOutHeadingTV.text =
                    view.context.getString(R.string.connection_time_out)
                connectionTimeoutTV.text = any.connTimeout
                responseTimeOutHeadingTV.text = view.context.getString(R.string.response_time_out)
                responseTimeoutTV.text = any.responseTimeout
                retryTimeOutHeadingTV.text = view.context.getString(R.string.retry_count)
                retryTimeoutTV.text = any.connRetryCnt
                sslSM.text = view.context.getString(R.string.is_ssl_enabled)
                sslSM.isChecked = any.isSSL
                isSSLChachingSM.text = view.context.getString(R.string.is_ssl_chaching_enabled)
                isSSLChachingSM.isChecked = any.isSSLCaching
                isSSLChachingSM.visibility = View.VISIBLE
                retryTimeOutHeadingTV.visibility = View.VISIBLE
                retryTimeoutTV.visibility = View.VISIBLE
            }
            if (any is GprsAuthPrimary) {
                headerNameTV.text = view.context.getString(R.string.gprs_auth_primary)
                ipHeadingTV.text = view.context.getString(R.string.ip)
                ipTV.text = any.ip
                portHeadingTV.text = view.context.getString(R.string.port)
                portTV.text = any.port
                connectionTimeOutHeadingTV.text =
                    view.context.getString(R.string.connection_time_out)
                connectionTimeoutTV.text = any.connTimeout

                responseTimeOutHeadingTV.text = view.context.getString(R.string.response_time_out)
                responseTimeoutTV.text = any.responseTimeout
                retryTimeOutHeadingTV.text = view.context.getString(R.string.retry_count)
                retryTimeoutTV.text = any.connRetryCnt
                sslSM.text = view.context.getString(R.string.is_ssl_enabled)
                sslSM.isChecked = any.isSSL
                isSSLChachingSM.text = view.context.getString(R.string.is_ssl_chaching_enabled)
                isSSLChachingSM.isChecked = any.isSSLCaching
                isSSLChachingSM.visibility = View.VISIBLE
                retryTimeOutHeadingTV.visibility = View.VISIBLE
                retryTimeoutTV.visibility = View.VISIBLE

            }
            if (any is GprsAuthSecondary) {
                headerNameTV.text = view.context.getString(R.string.gprs_auth_secondary)
                ipHeadingTV.text = view.context.getString(R.string.ip)
                ipTV.text = any.ip
                portHeadingTV.text = view.context.getString(R.string.port)
                portTV.text = any.port
                connectionTimeOutHeadingTV.text =
                    view.context.getString(R.string.connection_time_out)
                connectionTimeoutTV.text = any.connTimeout
                responseTimeOutHeadingTV.text = view.context.getString(R.string.response_time_out)
                responseTimeoutTV.text = any.responseTimeout
                retryTimeOutHeadingTV.text = view.context.getString(R.string.retry_count)
                retryTimeoutTV.text = any.connRetryCnt
                sslSM.text = view.context.getString(R.string.is_ssl_enabled)
                sslSM.isChecked = any.isSSL
                isSSLChachingSM.text = view.context.getString(R.string.is_ssl_chaching_enabled)
                isSSLChachingSM.isChecked = any.isSSLCaching
                isSSLChachingSM.visibility = View.VISIBLE
                retryTimeOutHeadingTV.visibility = View.VISIBLE
                retryTimeoutTV.visibility = View.VISIBLE
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TmsConnectionViewHolder =
        TmsConnectionViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.tms_connection_item, parent, false)
        )

    override fun onBindViewHolder(holder: TmsConnectionViewHolder, position: Int) =
        holder.bind(list[position])

    override fun getItemCount(): Int = list.size
}