package com.example.hiprojecttest.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.hiprojecttest.databinding.FragmentEMailBinding

class EmailFragment : Fragment(){
//    private var binding:FragmentEMailBinding?=null
    private lateinit var binding: FragmentEMailBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding= FragmentEMailBinding.inflate(inflater,container,false)
        val view = binding.root
        return view


    }

}
