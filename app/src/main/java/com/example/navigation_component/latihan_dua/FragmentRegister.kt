package com.example.navigation_component.latihan_dua

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.navigation_component.R
import com.example.navigation_component.databinding.FragmentRegisterBinding


class FragmentRegister : Fragment() {
    private lateinit var binding:FragmentRegisterBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentRegisterBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnRegister.setOnClickListener {
            findNavController().navigate(R.id.action_fragmentRegister_to_fragmentLogin)
        }
        binding.loginlink.setOnClickListener {
            findNavController().navigate(R.id.action_fragmentRegister_to_fragmentLogin)
        }
    }

}