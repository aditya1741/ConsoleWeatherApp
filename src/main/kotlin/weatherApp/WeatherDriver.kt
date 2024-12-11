package org.aditya.weatherApp

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

suspend fun weatherDriver() {
    val API_KEY: String = "0f21802ae418ea8a4a6923326fb00030"
    val BASE_URL: String = "https://api.openweathermap.org"

    val retrofit = Retrofit
        .Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    val weatherApi = retrofit.create(WeatherApi::class.java)

    println("=== Kotlin Console Weather App ===")
    print("Enter a city Name : ")
    val city = readln()

    try {
        val response = weatherApi.getWeather(city, apikey = API_KEY)
        println("Weather for ${response.cityName} : ")
        println("Temprature  : ${response.main.temprature}")
        println("Humidity : ${response.main.humidity}")
        println("Description ${response.weather[0].description}")
    } catch (e: Exception) {
        print(e.toString())
    }

}