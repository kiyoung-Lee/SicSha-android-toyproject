package com.sicsha.Common

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by kiyoungLee on 2018-01-09.
 */


class RetrofitClient {

    companion object {
        fun <T> createService(client: Class<T>, baseUrl: String): T {
            return Retrofit
                    .Builder()
                    .baseUrl(baseUrl)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
                    .create(client)
        }
    }
}