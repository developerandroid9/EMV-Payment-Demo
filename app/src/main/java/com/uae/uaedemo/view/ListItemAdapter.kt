package com.uae.uaedemo.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.uae.uaedemo.R
import com.uae.uaedemo.databinding.AidListItemBinding
import com.uae.uaedemo.model.*

class AidListAdapter(  private var list: List<AidListItem>
) : RecyclerView.Adapter<AidListAdapter.AidLisAdapterViewHolder>() {

    inner class AidLisAdapterViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private var aidListItemBinding: AidListItemBinding? = null

        init {
            aidListItemBinding = DataBindingUtil.bind(view)
        }

        fun bind( aidListItem:AidListItem) {
            aidListItemBinding?.data = aidListItem
            aidListItemBinding?.executePendingBindings()


        }




    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AidLisAdapterViewHolder =
        AidLisAdapterViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.aid_list_item, parent, false)
        )

    override fun onBindViewHolder(holder: AidLisAdapterViewHolder, position: Int) = holder.bind(list[position])

    override fun getItemCount(): Int = list.size

}