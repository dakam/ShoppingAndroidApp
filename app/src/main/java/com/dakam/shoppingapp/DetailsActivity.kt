package com.dakam.shoppingapp

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.shoping_item.view.*

class DetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
        var intent = intent
        var product = intent.getSerializableExtra("product") as Product
        var title= findViewById<TextView>(R.id.title)
        var color= findViewById<TextView>(R.id.color)
        var itemid= findViewById<TextView>(R.id.itemid)
        var details= findViewById<TextView>(R.id.details)
        var image= findViewById<ImageView>(R.id.image)

        title.text = product.Title
        color.text = "Color: " +product.color
        itemid.text= "Wallmart # "+product.itemid
        details.text= "Item Description : \n"+ product.desc

        val path: Uri = Uri.parse("android.resource://com.dakam.shoppingapp/drawable/"+product.image)

        image.setImageURI(path)


    }
}