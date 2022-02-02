package com.example.parsejsonappspace.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.parsejsonappspace.JsonParser
import com.example.parsejsonappspace.MainViewModel
import com.example.parsejsonappspace.StudentAdapterclass
import com.example.parsejsonappspace.databinding.ActivityMainBinding
import com.example.parsejsonappspace.models.EmployeeModel
import java.io.File

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
        info= JsonParser.parseJson(viewModel.text)

        init()
    }

    fun init() {
        initRecyclerAdapter()

    }

    private fun initRecyclerAdapter() {
        val rvContacts = binding.studentRecycler
        adapter = StudentAdapterclass(info)
        rvContacts.adapter = adapter
        rvContacts.layoutManager = LinearLayoutManager(this)
    }
}