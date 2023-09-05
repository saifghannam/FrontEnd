package com.example.firstprojectinandroidkotlinfrontend

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.firstprojectinandroidkotlinfrontend.databinding.ActivityMain3Binding
import java.net.URL

class MainActivity3 : AppCompatActivity() {
    lateinit var binding: ActivityMain3Binding
    lateinit var textView: TextView
    lateinit var button: Button
    lateinit var button2: Button
    lateinit var editText: EditText
    lateinit var number1: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMain3Binding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        textView = findViewById(R.id.textView)
        button=findViewById(R.id.back)
        button2=findViewById(R.id.google)
        editText=findViewById(R.id.e2)
        number1=findViewById(R.id.call)

        var name = intent.getStringExtra("extraName")
        textView.text = name
        baked()
        goToGoogle()
        callPhone()

    }
private fun callPhone(){

    number1.setOnClickListener {
        var nuberPhone=editText.text.toString()
        var intent=Intent(Intent.ACTION_DIAL)
        intent.data=Uri.parse("tel:$nuberPhone")
        startActivity(intent)

    }

}
private fun goToGoogle(){

    button2.setOnClickListener {
        var intent=Intent(Intent.ACTION_VIEW)
        intent.data= Uri.parse("https://www.google.com/")
        startActivity(intent)


    }

}
    private fun baked(){
        button.setOnClickListener {
            finish()

        }


}}





