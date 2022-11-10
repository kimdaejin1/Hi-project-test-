package com.example.hiprojecttest.fragment

import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.hiprojecttest.R
import com.example.hiprojecttest.databinding.FragmentRealNameBinding
import com.example.hiprojecttest.setOnTextChanged


class RealNameFragment : Fragment() {
    lateinit var navController: NavController
    private lateinit var binding: FragmentRealNameBinding
    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding= FragmentRealNameBinding.inflate(inflater,container,false)
        val view = binding.root
        return inflater.inflate(R.layout.fragment_real_name,container,false)

    }

    @RequiresApi(Build.VERSION_CODES.M)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)

        var setting = binding.inputTextName.toString()
        val color = requireActivity().getColor(R.color.yellow)
        val color1 = requireActivity().getColor(R.color.hint_black)


        binding.inputTextName.setOnTextChanged { p0, p1, p2, p3 ->
            if (!p0.isNullOrBlank()){
                Log.d("TAG", "is not NULL ")
                binding.nextStageBtn.setBackgroundColor(color)
                binding.nextStageBtn.setOnClickListener {
                    Log.d("TAG", "onClick")
                    navController.navigate(R.id.action_real_nameFragment_to_e_mailFragment)
                }
            }
            if (p0.isNullOrBlank()){
                Log.d("TAG", "is NULL")
                binding.nextStageBtn.setBackgroundColor(color1)
            }
        }
    }


}

