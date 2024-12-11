package org.aditya.weatherApp

import com.google.gson.annotations.SerializedName

data class WeatherResponse(
    @SerializedName("name") val cityName: String,
    @SerializedName("main") val main: WeatherMain,
    @SerializedName("weather") val weather : List<Weather>

    )
