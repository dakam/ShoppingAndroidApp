package com.dakam.shoppingapp

import android.graphics.drawable.Drawable
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.shoping_item.view.*


class MyAdapter(var blist: ArrayList<Product>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {
    var onItemClick: ((Product) -> Unit)? = null
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyAdapter.MyViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.shoping_item,parent,false)
        return MyViewHolder(view)

    }
    override fun onBindViewHolder(holder: MyAdapter.MyViewHolder, position: Int) {
        var imgStr= blist[position].image
        holder.itemView.name.text = blist[position].Title
        holder.itemView.price.text = "Price: "+blist[position].price.toString()
        holder.itemView.color.text = "Color: "+blist[position].color
        val otherPath: Uri = Uri.parse("android.resource://com.dakam.shoppingapp/drawable/"+imgStr)

        holder.itemView.image.setImageURI(otherPath)

    }
    override fun getItemCount(): Int {
        return blist.size

    }

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        init {
            itemView.setOnClickListener {
                onItemClick?.invoke(blist[adapterPosition])
            }
        }
    }
}