package com.sicsha.Main.Adapter

import android.os.Parcel
import android.os.Parcelable
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.sicsha.Common.BaseRecyclerViewHolder
import com.sicsha.Main.Data.Menu
import com.sicsha.R

/**
 * Created by kiyoungLee on 2018-01-12.
 */

class MainMenuTypeAdapter(val userList: ArrayList<Menu>) : RecyclerView.Adapter<MainMenuTypeViewHolder>() {

    //this method is returning the view for each item in the list
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainMenuTypeViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.main_menutype_holder, parent, false)
        return MainMenuTypeViewHolder(v)
    }

    //this method is binding the data on the list
    override fun onBindViewHolder(holder: MainMenuTypeViewHolder, position: Int) {
        holder.bindItems(userList[position])
    }

    //this method is giving the size of the list
    override fun getItemCount(): Int {
        return userList.size
    }
}