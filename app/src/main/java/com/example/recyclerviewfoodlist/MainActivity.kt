package com.example.recyclerviewfoodlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    var foods = mutableListOf<Food>(
        Food("Sushi",R.drawable.sushi,80),
        Food("Pizza",R.drawable.pizza,70),
        Food("Pear",R.drawable.pear,5),
        Food("Pancake",R.drawable.pancake,20),
        Food("Macrons",R.drawable.macrons,50),
        Food("Hamburger",R.drawable.hamburger,60),
        Food("Fries",R.drawable.fries,14),
        Food("Crossiant",R.drawable.crossiant,15),
        Food("bananna",R.drawable.bananna,10),
        Food("Avocado",R.drawable.avocado,47),



    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var recyclerView = findViewById<RecyclerView>(R.id.recycleView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val adapter = foodRecycleAdapter(this,foods)

        recyclerView.adapter = adapter


    }
}