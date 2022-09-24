package com.uae.uaedemo.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.uae.uaedemo.R
import com.uae.uaedemo.databinding.KeyValueListItemBinding
import com.uae.uaedemo.model.ParmKeyConfig

class KeyValueAdapter(val list: List<ParmKeyConfig>) :
    RecyclerView.Adapter<KeyValueAdapter.KeyValueViewHolder>() {
    inner class KeyValueViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private var keyValueListItemBinding: KeyValueListItemBinding? = null

        init {
            keyValueListItemBinding = DataBindingUtil.bind(view)
        }

        fun bind(parmKeyConfig: ParmKeyConfig?) {
            keyValueListItemBinding?.data = parmKeyConfig
            keyValueListItemBinding?.executePendingBindings()

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KeyValueViewHolder =
        KeyValueViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.key_value_list_item, parent, false)
        )

    override fun onBindViewHolder(holder: KeyValueViewHolder, position: Int) =
        holder.bind(list[position])

    override fun getItemCount(): Int = list.size
}