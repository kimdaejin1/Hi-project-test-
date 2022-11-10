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
import com.example.hiprojecttest.fragment.e_mailFragment
import com.example.hiprojecttest.fragment.real_nameFragment


class SinupActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySinupBinding

    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivitySinupBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        setFregment(0)


    }
    fun setFregment(fragmentNum:Int) {
        val ft = supportFragmentManager.beginTransaction()
        when(fragmentNum){
            0 ->{
                ft.replace(R.id.sin_up_frame,real_nameFragment()).commit()
            }
            1 ->{
                ft.replace(R.id.sin_up_frame,e_mailFragment()).commit()
            }
        }
    }
}