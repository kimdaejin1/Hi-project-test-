package com.example.hiprojecttest

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import androidx.annotation.RequiresApi
import com.example.hiprojecttest.databinding.ActivitySinupBinding



class SinupActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySinupBinding

    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivitySinupBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        var setting = binding.inputTextName.text.toString()
        val color = getColor(R.color.yellow)

        binding.inputTextName.setOnTextChanged { p0, p1, p2, p3 ->
            Log.d("TAG", "onCreate: ${p0.isNullOrBlank()}")
            if(!p0.isNullOrBlank()){
                val color = getColor(R.color.yellow)
                binding.nextStageBtn.setBackgroundColor(color)
            }
            if(p0.isNullOrBlank()){
                val button_color =getColor(R.color.hint_black)
                binding.nextStageBtn.setBackgroundColor(button_color)
            }
        }

        binding.preveAcountBtn.setOnClickListener {
            var intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        binding.backTrakingBtn.setOnClickListener{
            var intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }


    }
}