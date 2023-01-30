package com.example.aumer

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterProducts(private val newItems : ArrayList<ProductsList>) : RecyclerView.Adapter<AdapterProducts.ViewHolder>() {
    private lateinit var mListener : onCardClickListener
    interface onCardClickListener {
        fun onCardClick(position: Int)
    }
    fun setOnCardClickListener(listener: onCardClickListener){
        mListener = listener
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.card_product,parent,false)
        return ViewHolder(itemView, mListener)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentProduct = newItems[position]
        holder.titleProduct.text = currentProduct.titleProduct
        holder.priceProduct.text = currentProduct.priceProduct
        holder.imageProduct.setImageResource(currentProduct.imageProduct)
    }

    override fun getItemCount(): Int {
        return newItems.size
    }

    class ViewHolder(itemView: View, listener : onCardClickListener) : RecyclerView.ViewHolder(itemView){
        val titleProduct : TextView = itemView.findViewById(R.id.titleProduct)
        val priceProduct : TextView = itemView.findViewById(R.id.priceProduct)
        val imageProduct : ImageView = itemView.findViewById(R.id.imageProduct)
        init {
            itemView.setOnClickListener {
                listener.onCardClick(adapterPosition)
            }
        }
    }
}