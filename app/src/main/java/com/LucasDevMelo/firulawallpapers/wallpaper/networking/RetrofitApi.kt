package com.LucasDevMelo.firulawallpapers.wallpaper.networking

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitApi {
    private const val BASE_URL = "http://localhost:3000/wallpapers"
    private val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
}