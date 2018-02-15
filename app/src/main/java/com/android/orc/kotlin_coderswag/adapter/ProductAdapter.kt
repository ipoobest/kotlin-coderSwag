package com.android.orc.kotlin_coderswag.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.android.orc.kotlin_coderswag.R
import com.android.orc.kotlin_coderswag.holder.CategotyHolder
import com.android.orc.kotlin_coderswag.holder.ProductHolder
import com.android.orc.kotlin_coderswag.model.Product

/**
 * Created by j.poobest on 15/2/2018 AD.
 */
class ProductAdapter(val context: Context, val product: List<Product> ) : RecyclerView.Adapter<ProductHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ProductHolder {
        val view = LayoutInflater.from(parent?.context)
                .inflate(R.layout.product_list_item, parent, false)

        return ProductHolder(view)

    }

    override fun getItemCount(): Int {
        return product.count()
    }

    override fun onBindViewHolder(holder: ProductHolder?, position: Int) {
        holder?.bindProduct(product[position], context)

    }
}