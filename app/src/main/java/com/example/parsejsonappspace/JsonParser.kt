package com.example.parsejsonappspace


import android.content.res.AssetManager
import android.content.res.loader.ResourcesProvider
import com.google.gson.Gson
import java.io.File


object JsonParser {
    inline fun <reified T> parseJson(json: String): T =
        Gson().fromJson(json, T::class.java)
}