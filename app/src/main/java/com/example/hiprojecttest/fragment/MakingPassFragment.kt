package com.example.hiprojecttest.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.hiprojecttest.databinding.FragmentEmailProveBinding
import com.example.hiprojecttest.databinding.FragmentMakingPassBinding


class MakingPassFragment : Fragment() {

    private lateinit var binding: FragmentMakingPassBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding =FragmentMakingPassBinding.inflate(inflater,container,false)
        return binding.root
    }



}