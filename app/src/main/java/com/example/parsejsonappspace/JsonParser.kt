package com.example.parsejsonappspace


import com.google.gson.Gson



object JsonParser {
    inline fun <reified T> parseJson(json: String): T =
        Gson().fromJson(json, T::class.java)

}