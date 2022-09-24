package com.uae.uaedemo.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.uae.uaedemo.R
import com.uae.uaedemo.databinding.CapkListItemBinding
import com.uae.uaedemo.model.CaKeyParamX

class CaKeyAdapter(val list: List<CaKeyParamX>) :
    RecyclerView.Adapter<CaKeyAdapter.CaKeyViewHolder>() {
    inner class CaKeyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var caKeyAdapterBinding: CapkListItemBinding? = null

        init {
            caKeyAdapterBinding = DataBindingUtil.bind(view)
        }

        fun bind(caKeyParamX: CaKeyParamX) {
            caKeyAdapterBinding?.data = caKeyParamX
            caKeyAdapterBinding?.executePendingBindings()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CaKeyViewHolder =
        CaKeyViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.capk_list_item, parent, false)
        )


    override fun onBindViewHolder(holder: CaKeyViewHolder, position: Int) =
        holder.bind(list[position])

    override fun getItemCount(): Int = list.size
}