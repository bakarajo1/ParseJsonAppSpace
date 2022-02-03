package com.example.parsejsonappspace

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.google.gson.Gson
import com.google.gson.GsonBuilder

class MainViewModel: ViewModel() {


    val text= "{\n" +
            "    \"students\": [\n" +
            "        {\n" +
            "            \"firstName\": \"giorgi\",\n" +
            "            \"lastName\": \"beridze\",\n" +
            "            \"points\": [10, 9, 9, 10]\n" +
            "        },\n" +
            "        {\n" +
            "            \"firstName\": \"bakari\",\n" +
            "            \"lastName\": \"zhghenti\",\n" +
            "            \"points\": [7, 8, 9, 9]\n" +
            "        },\n" +
            "        {\n" +
            "            \"firstName\": \"irakli\",\n" +
            "            \"lastName\": \"matcharashvili\",\n" +
            "            \"points\": [7, 8, 6, 9]\n" +
            "        },\n" +
            "        {\n" +
            "            \"firstName\": \"giorgi\",\n" +
            "            \"lastName\": \"matcharashvili\",\n" +
            "            \"points\": [6, 6, 9, 8]\n" +
            "        }\n" +
            "    ]\n" +
            "}"





        fun <T>parseJson(json: String?,temp:Class <T>): T? {

                val gson= GsonBuilder().create()

                return gson.fromJson(json,temp)
        }



}