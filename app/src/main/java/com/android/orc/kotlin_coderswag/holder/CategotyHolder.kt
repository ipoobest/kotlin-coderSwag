package com.android.orc.kotlin_coderswag.holder

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.android.orc.kotlin_coderswag.R
import com.android.orc.kotlin_coderswag.model.Category
import kotlinx.android.synthetic.main.category_list_item.view.*

/**
 * Created by j.poobest on 14/2/2018 AD.
 */
class CategotyHolder(itemView: View?, val itemClick: (Category) -> Unit) : RecyclerView.ViewHolder(itemView) {

    val categoryImage = itemView?.findViewById<ImageView>(R.id.categoryImage)
    val categoryName = itemView?.findViewById<TextView>(R.id.categoryName)


    fun bindCategory(category: Category, context: Context) {
        val resourceID = context.resources.getIdentifier(category.image,
                "drawable", context.packageName)

        categoryImage?.setImageResource(resourceID)
        categoryName?.text = category.title

        itemView.setOnClickListener {itemClick(category)  }


    }


}