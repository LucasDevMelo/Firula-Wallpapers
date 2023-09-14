package com.LucasDevMelo.firulawallpapers.wallpaper.networking

import com.LucasDevMelo.firulawallpapers.wallpaper.networking.model.Wallpaper
import retrofit2.http.GET
import retrofit2.http.Query

interface RetrofitServices {

    @GET("Random")
    suspend fun getHomeFromApi(@Query("page")page: Int) : Wallpaper

    @GET("Popular")
    suspend fun getPopularFromAPI(@Query("page") page: Int) : Wallpaper

    @GET("latest")
    suspend fun getLatestFromAPI(@Query("page")page: Int): Wallpaper

    @GET("Category")
    suspend fun getCategoryFromAPI(
        @Query("page") page: Int,
        @Query("category") category: String
    ) :Wallpaper
}