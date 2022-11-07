package com.example.hiprojecttest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hiprojecttest.databinding.ActivitySinupBinding



class SinupActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySinupBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivitySinupBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.preveAcountBtn.setOnClickListener{
            var intent = Intent(this,LoginActivity::class.java)
           startActivity(intent)
        }

    }
}