package com.example.aumer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.aumer.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnProduct.setOnClickListener{
            replaceFragment(Products())
        }
        binding.btnOrders.setOnClickListener{
            replaceFragment(Orders())
        }
        binding.btnProfile.setOnClickListener{
            replaceFragment(Profile())
        }
        binding.btnContactUs.setOnClickListener{
            replaceFragment(ContactUs())
        }
    }


    private fun replaceFragment(fragment : Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragmentContainerView4,fragment)
        fragmentTransaction.commit()
    }
}