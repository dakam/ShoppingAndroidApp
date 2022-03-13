package com.dakam.shoppingapp

import java.io.Serializable

data class Product (var Title : String, var price: Double,var image:String,var itemid: String, var desc:String, var color: String ):
    Serializable {

}

