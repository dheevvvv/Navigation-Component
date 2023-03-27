package com.example.navigation_component.latihan_dua

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.navigation_component.R
import com.example.navigation_component.databinding.FragmentLoginBinding


class FragmentLogin : Fragment() {

    private lateinit var binding:FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentLoginBinding.inflate(layoutInflater,container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnLogin.setOnClickListener {
            val usernamee = binding.etUsername.text.toString()
            val bundle = Bundle()
            bundle.putString("username", usernamee)
            findNavController().navigate(R.id.action_fragmentLogin_to_fragmentHome2, bundle)
        }

        binding.signuplink.setOnClickListener {
            findNavController().navigate(R.id.action_fragmentLogin_to_fragmentRegister)
        }
    }


}