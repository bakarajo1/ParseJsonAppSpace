package com.example.parsejsonappspace

import android.content.Context
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.io.IOException
import java.io.InputStream


fun getCountryCode(context: Context): List<Student> {

    lateinit var jsonString: String
    try {
        jsonString = context.assets.open("assets/info.json")
            .bufferedReader()
            .use { it.readText() }
    } catch (ioException: IOException) {
        jsonString=ioException.toString()
    }

    val listCountryType = object : TypeToken<List<Student>>() {}.type
    return Gson().fromJson(jsonString, listCountryType)
}
//here Gson() is basically providing fromJson methods which actually //deserializing json. It basically parse json string to //list<Country> object
//this getCountryCode(ctx: Context) will return a list of Country data class.