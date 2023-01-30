package com.example.aumer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.example.aumer.databinding.ActivityProductInfoBinding

class ProductInfo : AppCompatActivity() {
    private lateinit var adapter : AdapterGallery
    private lateinit var binding : ActivityProductInfoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProductInfoBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val bundle : Bundle? = intent.extras
        val titleProductExtra = bundle!!.getString("titleProduct")
        val priceProductExtra = bundle.getString("priceProduct")
        val imageProductExtra = bundle.getInt("imageProduct")
        val galleryProduct = bundle.getIntegerArrayList("galleryProduct")
        binding.viewPagerCurrent.text = "1 / "+galleryProduct!!.size
        adapter = AdapterGallery(this,galleryProduct!!)
        binding.viewPager.adapter = adapter
        binding.viewPager.registerOnPageChangeCallback(object: ViewPager2.OnPageChangeCallback(){
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                val currently = position+1
                binding.viewPagerCurrent.text = "$currently / "+galleryProduct!!.size
            }
        })

        binding.titleProduct.text = titleProductExtra
        binding.priceProduct.text = priceProductExtra
        binding.btn8.setOnClickListener{
            val intent = Intent(this,Login::class.java)
            startActivity(intent)
        }
//        binding.imageProduct.text = imageProductExtra
    }
}