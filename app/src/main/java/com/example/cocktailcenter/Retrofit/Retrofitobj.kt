package com.example.cocktailcenter.Retrofit

import com.example.cocktailcenter.Utils.Constants
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object Retrofitobj
{
    val apiservice:Apiservice

    init {
            val client=OkHttpClient.Builder().build()
        apiservice= Retrofit.Builder().baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(client)
            .build()
            .create(Apiservice::class.java)
    }
}