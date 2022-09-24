package com.uae.uaedemo.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.uae.uaedemo.R
import com.uae.uaedemo.databinding.ClsAidItemBinding
import com.uae.uaedemo.model.KernelAid

class ClsAidAdapter(val list: List<KernelAid>?) :
    RecyclerView.Adapter<ClsAidAdapter.ClsAidHewHolder>() {
    inner class ClsAidHewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private var clsAidItemBinding: ClsAidItemBinding? = null

        init {
            clsAidItemBinding = DataBindingUtil.bind(view)
        }

        fun bind(kernelAid: KernelAid?) {
            clsAidItemBinding?.data = kernelAid
            clsAidItemBinding?.executePendingBindings()

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ClsAidHewHolder =
        ClsAidHewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.cls_aid_item, parent, false)
        )

    override fun onBindViewHolder(holder: ClsAidHewHolder, position: Int)
    {
        holder.bind(list?.get(position))
        val layoutParams = holder.itemView.layoutParams as StaggeredGridLayoutManager.LayoutParams
        layoutParams.isFullSpan = true
    }


    override fun getItemCount(): Int = list?.size ?: 0
}