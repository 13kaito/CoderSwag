package com.kk.coderswag.Services

import com.kk.coderswag.Model.Category
import com.kk.coderswag.Model.Product

object DataService {
    val categories = listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
        Product("Devslopes Graphic Beanie", "$18", "hat1"),
        Product("Devslopes Hat Black", "$20", "hat2"),
        Product("Devslopes Hat White", "$18", "hat3"),
        Product("Devslopes Hat Snapback", "$22", "hat4")
    )

    val hoodies = listOf(
        Product("Devslopes Hoodie Gray", "$28", "hoodie1"),
        Product("Devslopes Hoodie Red", "$32", "hoodie2"),
        Product("Devslopes Hoodie White", "$28", "hoodie3"),
        Product("Devslopes Hoodie Blue", "$22", "hoodie4")
    )

    val shirts = listOf(
        Product("Devslopes Shirt Gray", "$28", "shirt1"),
        Product("Devslopes Shirt Black", "$20", "shirt2"),
        Product("Devslopes Shirt White", "$18", "shirt3"),
        Product("Devslopes Shirt Blue", "$22", "shirt4")
    )

    val digitalGood = listOf<Product>()

    fun getProduct(category: String):List<Product>{

        return when(category){
            "SHIRTS" -> shirts
            "HATS" -> hats
            "HOODIES" -> hoodies
            else -> digitalGood
        }
    }
}