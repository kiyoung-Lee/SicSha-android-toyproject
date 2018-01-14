package com.sicsha.Main.Adapter

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView
import com.sicsha.Main.Data.Menu
import com.sicsha.R
import kotlinx.android.synthetic.main.main_menu_holder.view.*

/**
 * Created by kiyoungLee on 2018-01-12.
 */
class MainMenuTypeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun bindItems(menu: Menu) {
        val menuType = itemView.menu_type;
        menuType.setText(menu.menuType);
    }
}