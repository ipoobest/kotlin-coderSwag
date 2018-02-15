package com.android.orc.kotlin_coderswag.holder

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.android.orc.kotlin_coderswag.R
import com.android.orc.kotlin_coderswag.model.Product

/**
 * Created by j.poobest on 15/2/2018 AD.
 */
class ProductHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {

    val productImage: ImageView = itemView?.findViewById(R.id.img_product) as ImageView
    val productName: TextView = itemView?.findViewById(R.id.tv_product_name) as TextView
    val productPrice: TextView = itemView?.findViewById(R.id.tv_product_price) as TextView

    fun bindProduct(product: Product, context: Context){
        val resourceId = context.resources.getIdentifier(product.image, "drawable", context.packageName)
        productImage?.setImageResource(resourceId)
        productName?.text = product.title
        productPrice?.text = product.price

    }

}