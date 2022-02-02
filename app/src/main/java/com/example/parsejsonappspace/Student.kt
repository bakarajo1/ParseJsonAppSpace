package com.example.parsejsonappspace


import com.google.gson.annotations.SerializedName

data class Student(
    @SerializedName("firstName")
    var firstName: String?,
    @SerializedName("lastName")
    var lastName: String?,
    @SerializedName("points")
    var points: List<Int>?
)