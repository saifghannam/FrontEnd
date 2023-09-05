package com.example.firstprojectinandroidkotlinfrontend

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.firstprojectinandroidkotlinfrontend.databinding.ActivityMain3Binding
import com.example.firstprojectinandroidkotlinfrontend.databinding.ActivityMain5Binding

class MainActivity5 : AppCompatActivity() {
    val MyFirstFragment=OneFragment()
    val MySucndFragment=TowFragment()
    lateinit var binding:ActivityMain5Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMain5Binding.inflate(layoutInflater)

        setContentView(binding.root)

        ShowFragment()
        clecked()


    }
    private fun clecked(){

           findViewById<Button>(R.id.zzz).setOnClickListener {

               ShowTowFragment()
           }

            findViewById<Button>(R.id.zzz2).setOnClickListener {

                Remve_Fragment(MySucndFragment)
            }
        }
    private fun Remve_Fragment(fragment: Fragment)
    {
        var transition=supportFragmentManager.beginTransaction()
        transition.remove(fragment)
        transition.commit()

    }
    private fun ShowFragment()
    {

        addFragment(MyFirstFragment)


    }

    private fun ShowTowFragment()
    {
        replaceFragment(MySucndFragment)


    }

    private fun addFragment(fragment: Fragment){

        var transition=supportFragmentManager.beginTransaction()
        transition.add(R.id.fragmentContainerView,fragment)
        transition.commit()
    }

    private fun replaceFragment(fragment: Fragment){

        var transition=supportFragmentManager.beginTransaction()
        transition.replace(R.id.fragmentContainerView,fragment)
        transition.commit()
    }
}