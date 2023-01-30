package com.example.aumer

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import androidx.recyclerview.widget.RecyclerView
import kotlin.collections.ArrayList

class AdapterGallery(var context: Context,private var imageProductExtra: ArrayList<Int>) : RecyclerView.Adapter<AdapterGallery.ImageViewHolder>() {
    val MyItems = imageProductExtra
    class ImageViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView) {
        var image_view : ImageView
        var container : RelativeLayout
        init {
            image_view = itemView.findViewById(R.id.image_view) as ImageView
            container = itemView.findViewById(R.id.container) as RelativeLayout
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        return ImageViewHolder(LayoutInflater.from(context).inflate(R.layout.gallery_product,parent,false))
    }

    override fun getItemCount(): Int {
        return MyItems.size
    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        holder.image_view.setImageResource(MyItems[position])
    }
}