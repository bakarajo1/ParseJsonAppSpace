package com.example.parsejsonappspace

import android.content.Context
import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.RetreiveFromFileObj
import com.example.parsejsonappspace.models.EmployeeModel
import com.example.parsejsonappspace.models.Student
import com.google.gson.GsonBuilder

class MainViewModel: ViewModel() {


    private val _parsedJsonModels = MutableLiveData<EmployeeModel>()
    val parsedJsonModels = _parsedJsonModels


    fun parseDataFromFile(context: Context) {


        val temp = RetreiveFromFileObj.getJsonFromAssets(
            context,
            context.getString(R.string.json_file_name)
        )
        _parsedJsonModels.postValue(JsonParser.parseJson(temp!!))


    }

}
