package com.example.firstprojectinandroidkotlinfrontend

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.firstprojectinandroidkotlinfrontend.databinding.ActivityMain2Binding


class MainActivity2 : AppCompatActivity() {
    lateinit var button: Button
    lateinit var button2: Button
    lateinit var textView: TextView
    lateinit var editText: EditText
    lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
            binding= ActivityMain2Binding.inflate(layoutInflater)

        setContentView(binding.root)

        button=findViewById(R.id.buttonn2)
        button2=findViewById(R.id.buttonn)
        textView=findViewById(R.id.textVieww)
        editText=findViewById(R.id.editTextText2)
        swaps()
        goAct()
    }

private fun swaps(){

    button.setOnClickListener {
        var tt=editText.text.toString()
        textView.text=tt

    }

}
    private fun goAct(){
        button2.setOnClickListener {
            var intent=Intent(this,MainActivity3::class.java)
            var name=binding.editTextText2.text.toString()
            intent.putExtra("extraName",name)
            startActivity(intent)


        }

    }
}