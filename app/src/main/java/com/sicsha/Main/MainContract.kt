package com.sicsha.Main

import android.support.v7.widget.RecyclerView
import com.sicsha.Common.BasePresenter
import com.sicsha.Main.Adapter.MainMenuTypeAdapter

/**
 * Created by kiyoungLee on 2018-01-10.
 */
interface MainContract {

    interface ActivityView{
        fun setAdapter(adapter: MainMenuTypeAdapter)
    }

    interface Presenter: BasePresenter{

    }
}