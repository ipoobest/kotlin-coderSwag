package com.android.orc.kotlin_coderswag.services

import com.android.orc.kotlin_coderswag.model.Category
import com.android.orc.kotlin_coderswag.model.Product

/**
 * Created by j.poobest on 12/2/2018 AD.
 */
object DataService {
    val categories = listOf(
            Category("SHIRTS","shirtimage"),
            Category("HOODIES","hoodieimage"),
            Category("HATS","hatimage"),
            Category("DIGITAL","digitalgoodsimage")
    )

    val hats = listOf(
            Product("Develops Graphic Beanie", "$99","hat1"),
            Product("Develops hat black", "$99","hat2"),
            Product("Develops hat white", "$99","hat3"),
            Product("Develops hat SanpBlack", "$99","hat4")
    )

    val hoodies = listOf(
            Product("Develops Graphic Beanie", "$99","hoodie1"),
            Product("Develops hat black", "$99","hoodie2"),
            Product("Develops hat white", "$99","hoodie3"),
            Product("Develops hat SanpBlack", "$99","hoodie4")
    )

    val shirts = listOf(
            Product("Develops Graphic Beanie", "$99","shirt1"),
            Product("Develops hat black", "$99","shirt2"),
            Product("Develops hat white", "$99","shirt3"),
            Product("Develops hat SanpBlack", "$99","shirt4")
    )

    val digitalGood = listOf<Product>()

    fun getProducts(category: String) : List<Product>{
       return when(category) {
            "SHIRTS" ->  shirts
            "HOODIES" ->  hoodies
            "HATS" ->  hats
            else ->  digitalGood
        }

    }

}