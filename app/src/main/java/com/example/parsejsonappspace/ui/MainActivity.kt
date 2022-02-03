package com.example.parsejsonappspace.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.parsejsonappspace.MainViewModel
import com.example.parsejsonappspace.StudentAdapterclass
import com.example.parsejsonappspace.databinding.ActivityMainBinding
import com.example.parsejsonappspace.models.EmployeeModel

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var info: EmployeeModel
    lateinit var adapter: StudentAdapterclass
    lateinit var viewModel: MainViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        viewModel.parseDataFromFile(applicationContext)
        init()
    }

    fun init() {
        setObserver()

    }

    private fun setObserver() {

        viewModel.parsedJsonModels.observe( this) { studentList ->
            info=studentList
            adapter = StudentAdapterclass(info)
             initRecyclerAdapter()
        }
    }


    private fun initRecyclerAdapter() {
        val rvStudents = binding.studentRecycler
        rvStudents.adapter = adapter
        rvStudents.layoutManager = LinearLayoutManager(this)
    }
}