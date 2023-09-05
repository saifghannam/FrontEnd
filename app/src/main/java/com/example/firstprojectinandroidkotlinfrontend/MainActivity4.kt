package com.example.firstprojectinandroidkotlinfrontend

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.firstprojectinandroidkotlinfrontend.databinding.ActivityMain3Binding
import com.example.firstprojectinandroidkotlinfrontend.databinding.ActivityMain4Binding

class MainActivity4 : AppCompatActivity() {
    lateinit var binding: ActivityMain4Binding
    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)

        binding= ActivityMain4Binding.inflate(layoutInflater)
        setContentView(binding.root)


    }



}