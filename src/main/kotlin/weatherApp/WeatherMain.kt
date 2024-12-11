package org.aditya.weatherApp
import com.google.gson.annotations.SerializedName
data class WeatherMain(
    @SerializedName("temp") val temprature : Double,
    @SerializedName("humidity") val humidity : Int
)

