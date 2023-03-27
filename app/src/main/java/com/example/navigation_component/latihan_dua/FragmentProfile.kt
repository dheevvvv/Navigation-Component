package com.example.navigation_component.latihan_dua

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.navigation_component.R
import com.example.navigation_component.databinding.FragmentProfileBinding


class FragmentProfile : Fragment() {

    private lateinit var binding:FragmentProfileBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentProfileBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val getUsername = arguments?.getString("username")
        binding.tvProfileUser.text = getUsername

        binding.btnLogout.setOnClickListener {
            findNavController().navigate(R.id.action_fragmentProfile_to_fragmentLogin)
        }
    }

}