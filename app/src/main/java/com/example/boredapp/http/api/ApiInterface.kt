package com.example.boredapp.http.api

import com.example.boredapp.http.response.Activity
import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {
    @GET("activity")
    suspend fun getActivity() : Activity
}