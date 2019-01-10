package com.geekhub.retrofitexample.data.model

import com.google.gson.annotations.SerializedName


data class WeatherResponse(
    @SerializedName("cod") val code: Int,
    @SerializedName("message") val message: Double,
    @SerializedName("cnt") val count: Int,
    @SerializedName("list") val list: List<WeatherWrapper>
) {

    data class WeatherWrapper(
        @SerializedName("dt") val someDt: Long,
        @SerializedName("weather") val weatherList: List<Weather>
    ) {

        data class Weather(
            @SerializedName("main") val main: String,
            @SerializedName("description") val description: String
        )
    }
}