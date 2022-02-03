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

object RetreiveFromFileObj {
    fun getJsonFromAssets(context: Context, fileName: String?): String? {
        val json = try {
            context.assets.open(fileName!!).bufferedReader().use { it.readText() }
        }catch (e: IOException){ "" }

        return json
    }
}