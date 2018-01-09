package com.sicsha.Common

/**
 * Created by kiyoungLee on 2018-01-09.
 */
interface BaseView<in T> {

    fun setPresenter(presenter: T)
}