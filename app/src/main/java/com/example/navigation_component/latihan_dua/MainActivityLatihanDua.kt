package com.example.navigation_component.latihan_dua

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.navigation_component.databinding.ActivityMainLatihanDuaBinding

class MainActivityLatihanDua : AppCompatActivity() {
    private lateinit var binding:ActivityMainLatihanDuaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainLatihanDuaBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}