package com.geekhub.retrofitexample.ui.main

import com.geekhub.retrofitexample.data.model.WeatherResponse
import com.geekhub.retrofitexample.data.repository.Repository
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MainPresenter(
    private val repository: Repository,
    val view: MainView
) {

    fun fetchWeather(city: String) {
        repository.getData(city).enqueue(object : Callback<WeatherResponse> {
            override fun onResponse(
                call: Call<WeatherResponse>,
                response: Response<WeatherResponse>
            ) {
                view.showWeather(response.body()!!.toString())
            }
            override fun onFailure(call: Call<WeatherResponse>, t: Throwable) {
                // fail
            }
        })
    }
}