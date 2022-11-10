package com.example.hiprojecttest.fragment

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.fragment.app.Fragment
import com.example.hiprojecttest.MainActivity
import com.example.hiprojecttest.R
import com.example.hiprojecttest.SinupActivity
import com.example.hiprojecttest.databinding.FragmentRealNameBinding
import com.example.hiprojecttest.setOnTextChanged


class real_nameFragment : Fragment() {
    private lateinit var binding: FragmentRealNameBinding
    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding= FragmentRealNameBinding.inflate(inflater,container,false)
        val view = binding.root

        var setting = binding.inputTextName.toString()
        val color = requireActivity().getColor(R.color.yellow)
        val color1 = requireActivity().getColor(R.color.hint_black)

        binding.inputTextName.setOnTextChanged { p0, p1, p2, p3 ->
            if (!p0.isNullOrBlank()){
                Log.d("TAG", "is not NULL ")
                binding.nextStageBtn.setBackgroundColor(color)
                binding.nextStageBtn.setOnClickListener {
                }
            }
            if (p0.isNullOrBlank()){
                Log.d("TAG", "is NULL")
                binding.nextStageBtn.setBackgroundColor(color1)
            }
        }

        return view
    }


}
