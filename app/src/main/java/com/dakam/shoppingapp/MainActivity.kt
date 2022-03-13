package com.dakam.shoppingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val products = ArrayList<Product>()
        products.add(Product("semi conductor Diods", 2000.0,"diods","1","These diods are manufactured righ from Chaina in a small town","Black"))
        products.add(Product("Transistors", 700.0,"transistors","2","These Transistors are manufactured  from china in a small town","Black"))
        products.add(Product("Watches", 300.0,"watches","3","These Watches are USA MADE","Red"))
        products.add(Product("Monitors", 400.0,"monitors","4","These Monitors are manufactured from USA","Blue"))

        recyclerView1.layoutManager = LinearLayoutManager(this)
        val adapter = MyAdapter(products)

        recyclerView1.adapter = adapter

        adapter.onItemClick = { product:Product ->

            val intent = Intent(this, DetailsActivity::class.java)
            intent.putExtra("product", product)
            startActivity(intent)
        }

    }
}