package com.geekhub.retrofitexample.data.repository

import com.geekhub.retrofitexample.data.model.WeatherResponse
import com.geekhub.retrofitexample.data.network.OpenWeatherService
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class Repository {

    private val retrofit = Retrofit.Builder()
        .baseUrl("https://api.openweathermap.org/data/2.5/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    private val openWeatherService = retrofit.create(OpenWeatherService::class.java)

    fun getData(city: String): Call<WeatherResponse> {
        return openWeatherService.getCurrentWeather(city)
    }
}