package com.example.parsejsonappspace.models


import com.google.gson.annotations.SerializedName

data class EmployeeModel(
    @SerializedName("students")
    var students: List<Student>?
)