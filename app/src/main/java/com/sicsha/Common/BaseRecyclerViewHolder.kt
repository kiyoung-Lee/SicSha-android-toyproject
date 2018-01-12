package com.sicsha.Common

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.View

/**
 * Created by kiyoungLee on 2018-01-09.
 */
class BaseRecyclerViewHolder<in T, P>(var context: Context, var presenter: P, itemView: View) : RecyclerView.ViewHolder(itemView) {
    init {

    }

    fun bind(data: T) {}

    fun bind(data: T, position: Int) {}
}