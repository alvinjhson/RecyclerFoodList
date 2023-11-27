package com.example.recyclerviewfoodlist

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class foodRecycleAdapter(val context: Context, val foods : List<Food>) : RecyclerView.Adapter<foodRecycleAdapter.ViewHolder>() {

    var layoutInflater = LayoutInflater.from(context)

    inner class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        var imageView: ImageView = itemView.findViewById(R.id.foodImageView)
        var foodTextView = itemView.findViewById<TextView>(R.id.foodTextView)
        var priceTextView = itemView.findViewById<TextView>(R.id.priceTextView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = layoutInflater.inflate(R.layout.list_item,parent,false)
        return ViewHolder(itemView)

    }

    override fun getItemCount(): Int {
        return foods.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val food = foods[position]
        val foodPrice = food.price.toString()
        holder.foodTextView.text = food.name
        holder.priceTextView.text = "$foodPrice kr"
        holder.imageView.setImageResource(food.foodImage)
    }


}