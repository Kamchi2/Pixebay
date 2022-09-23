package com.example.pixebay

import android.app.Application

class App: Application() {

    companion object {
        lateinit var api: PixeApi
    }

    override fun onCreate() {
        super.onCreate()
        api = RetrofitService().api
    }
}