package com.example.navigation_component.latihan_dua

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.navigation_component.R
import com.example.navigation_component.databinding.FragmentHomeBinding

class FragmentHome : Fragment() {

    private lateinit var binding:FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val getName = arguments?.getString("username")
        binding.tvHome.text = "Hello $getName"

        binding.homeProfile.setOnClickListener{
            val usernamee = arguments?.getString("username")
            val bundle = Bundle()
            bundle.putString("username", usernamee)
            findNavController().navigate(R.id.action_fragmentHome_to_fragmentProfile, bundle)
        }
    }

}