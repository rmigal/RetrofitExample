package com.geekhub.retrofitexample.data.network

import com.geekhub.retrofitexample.data.model.WeatherResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query


interface OpenWeatherService {

    @GET("forecast")
    fun getCurrentWeather(
        @Query("q") city: String,
        @Query("mode") mode: String = "json",
        @Query("APPID") appId: String = "f791b93359beda848eebd31c8a909c45"
    ): Call<WeatherResponse>

    @GET("forecast/{city}/main")
    fun getWeatherForCity(@Path("city") city: String)
}