package com.example.firstprojectinandroidkotlinfrontend

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.firstprojectinandroidkotlinfrontend.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var button: Button
    lateinit var button2: Button
    lateinit var button3: Button
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        button=findViewById(R.id.a)
        button2=findViewById(R.id.frag)
        button3=findViewById(R.id.miothId)
        button.setOnClickListener {

            showMy()}
            button2.setOnClickListener {
            showFragment()}

        button3.setOnClickListener {

            showFragment2()

        }




    }
    private fun showFragment(){

            var intent=Intent(this,MainActivity4::class.java)
            startActivity(intent)



    }
    private fun showFragment2(){

        var intent=Intent(this,MainActivity5::class.java)
        startActivity(intent)



    }

    private fun showMy(){
        var intent=Intent(this,MainActivity2::class.java)
        startActivity(intent)


    }
}