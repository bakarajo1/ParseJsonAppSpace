package com.example

import android.content.ContentValues.TAG
import android.content.Context
import android.util.Log
import androidx.test.platform.app.InstrumentationRegistry
import java.io.IOException
import java.io.InputStream
import java.nio.channels.AsynchronousFileChannel.open
import java.nio.charset.StandardCharsets
import kotlin.math.log

object KK {
    fun getJsonFromAssets(context: Context, fileName: String?): String? {
        val jsonString: String
        val json = try {
            context.assets.open(fileName!!).bufferedReader().use { it.readText() }
        }catch (e: IOException){ "" }

        Log.d("bakar",json )



//        jsonString = try {
//
//            val `is` = context.assets.open(fileName!!)
//            val size = `is`.available()
//            val buffer = ByteArray(size)
//            `is`.read(buffer)
//            `is`.close()
//            String(buffer, StandardCharsets.UTF_8)
//        } catch (e: IOException) {
//            e.printStackTrace()
//            return null
//        }
        return json
    }
}