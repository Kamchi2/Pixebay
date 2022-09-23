package com.example.pixebay

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitService {
    private val retrofit = Retrofit.Builder().baseUrl("https://pixabay.com/api/").addConverterFactory(
        GsonConverterFactory.create()).build()

    val api = retrofit.create(PixeApi::class.java)
}