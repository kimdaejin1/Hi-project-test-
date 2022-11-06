package com.example.hiprojecttest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hiprojecttest.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.logInButton.setOnClickListener{

        }

        binding.sinUpButton.setOnClickListener{
            var intent = Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }
    }

}