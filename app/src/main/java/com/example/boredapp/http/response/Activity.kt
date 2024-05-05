package com.example.boredapp.http.response

data class Activity(
    val activity:String,
    val type:String,
    val participants:Int,
    val price:Double,
    val link:String,
    val key:String,
    val accessibility:String
)