package com.example.parsejsonappspace

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.parsejsonappspace.databinding.StudentRecyclerItemBinding

class StudentAdapterclass(private val employeeModel: EmployeeModel): RecyclerView.Adapter<StudentAdapterclass.ViewHolder>() {


    class ViewHolder(private val binding:StudentRecyclerItemBinding):RecyclerView.ViewHolder(binding.root) {

        fun onBind(student: Student) {
            with(binding) {


                textView.text=student.firstName
                textView2.text=student.lastName
            }

        }
    }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentAdapterclass.ViewHolder {

            return ViewHolder(
                StudentRecyclerItemBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )
            )



    }

    override fun onBindViewHolder(holder: StudentAdapterclass.ViewHolder, position: Int) {


             holder.onBind(employeeModel.students!![position])

        }


    override fun getItemCount(): Int =employeeModel.students!!.size




}