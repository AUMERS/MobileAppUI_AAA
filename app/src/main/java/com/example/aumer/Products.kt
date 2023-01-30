package com.example.aumer

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class Products : Fragment() {
    private lateinit var adapter : AdapterProducts
    private lateinit var RecyclerView : RecyclerView
    private lateinit var arrayList : ArrayList<ProductsList>
    lateinit var productTitle : Array<String>
    lateinit var productPrice : Array<String>
    lateinit var productImage : Array<Int>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_products, container, false)
    }

    companion object {
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        arrayList = products
        val layoutManager = LinearLayoutManager(context)
        RecyclerView = view.findViewById(R.id.containerCards)
        RecyclerView.layoutManager = layoutManager
        RecyclerView.setHasFixedSize(true)
        adapter = AdapterProducts(arrayList)
        RecyclerView.adapter = adapter
        adapter.setOnCardClickListener(object : AdapterProducts.onCardClickListener{
            override fun onCardClick(position: Int) {
                val intent = Intent(activity as MainActivity,ProductInfo::class.java)
                intent.putExtra("titleProduct",arrayList[position].titleProduct)
                intent.putExtra("priceProduct",arrayList[position].priceProduct)
                intent.putExtra("imageProduct",arrayList[position].imageProduct)
                intent.putExtra("galleryProduct",arrayList[position].galleryProduct)
                startActivity(intent)
            }
        })
    }
}