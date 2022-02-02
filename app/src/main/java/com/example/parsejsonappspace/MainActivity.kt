package com.example.parsejsonappspace

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.parsejsonappspace.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var info:EmployeeModel
    lateinit var adapter:StudentAdapterclass
    lateinit var viewModel: MainViewModel
    lateinit var temp:EmployeeModel
    lateinit var temp1:List<Student>
    lateinit var temp2:EmployeeModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

       viewModel= ViewModelProvider(this).get(MainViewModel::class.java)



        info= viewModel.parseJson(viewModel.text)!!
        //info=MainViewModel.JsonParser.parseJsonToData(viewModel.text)
        val student:Student= Student("bakar","zhgenti", listOf(10,1))
        temp= EmployeeModel(listOf(student))
        init()
    }

    fun init(){

        val rvContacts = binding.studentRecycler

        // Create adapter passing in the sample user data
        adapter = StudentAdapterclass(info)
        // Attach the adapter to the recyclerview to populate items
        rvContacts.adapter = adapter
        // Set layout manager to position the items
        rvContacts.layoutManager = LinearLayoutManager(this)
        // That's all!



    }
}