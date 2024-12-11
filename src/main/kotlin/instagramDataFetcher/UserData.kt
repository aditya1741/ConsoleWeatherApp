package org.aditya.instagramDataFetcher

import kotlinx.coroutines.coroutineScope
import okhttp3.MediaType
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody
import okhttp3.RequestBody.Companion.toRequestBody

suspend fun getUserData(userName: String) {
    val client = OkHttpClient()
    val mediaType = "application/json".toMediaTypeOrNull()
    val requestBody = "{username:${userName}}".toRequestBody(mediaType)
    val request = Request.Builder()
        .url("https://rocketapi-for-instagram.p.rapidapi.com/instagram/user/get_info")
        .post(body = requestBody)
        .addHeader("x-rapidapi-key", "66db21ddc1mshd2e55d6ef6e72c7p1aac09jsnac40e9620b07")
        .addHeader("x-rapidapi-host", "rocketapi-for-instagram.p.rapidapi.com")
        .addHeader("Content-Type", "application/json")
        .build()
    coroutineScope {
        val response = client.newCall(request).execute()
        println(response.message)
    }



}