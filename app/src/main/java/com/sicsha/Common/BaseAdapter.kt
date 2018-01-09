package com.sicsha.Common

/**
 * Created by kiyoungLee on 2018-01-09.
 */
interface BaseAdapter {

    interface Model<in T>{
        fun replaceData(data: T)
    }

    interface View<in T>{
        fun setPresenter(presenter: T)

        fun notifyAdapter()
    }
}