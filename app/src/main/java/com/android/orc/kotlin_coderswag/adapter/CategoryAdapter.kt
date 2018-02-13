package com.android.orc.kotlin_coderswag.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.android.orc.kotlin_coderswag.R
import com.android.orc.kotlin_coderswag.R.id.categoryImage
import com.android.orc.kotlin_coderswag.model.Category

/**
 * Created by j.poobest on 13/2/2018 AD.
 */
class CategoryAdapter(context: Context, category: List<Category>) : BaseAdapter() {

    val context = context
    val category = category

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val categoryView: View
        val holder: ViewHolder

        if (convertView == null) {

            categoryView = LayoutInflater.from(context).inflate(R.layout.category_list_item, null)
            holder = ViewHolder()
            holder.categoryImage = categoryView.findViewById(R.id.categoryImage)
            holder.categoryName = categoryView.findViewById(R.id.categoryName)

            categoryView.tag = holder

        } else {
            holder = convertView.tag as ViewHolder
            categoryView = convertView
        }

        val category = category[position]
        val resourceId = context.resources.getIdentifier(category.image, "drawable", context.packageName)


        holder.categoryImage?.setImageResource(resourceId)
        print(resourceId)
        holder.categoryName?.text = category.title



        return categoryView
    }

    override fun getItem(position: Int): Any {
        return category[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return category.count()
    }

    private class ViewHolder {
        var categoryImage: ImageView? = null
        var categoryName: TextView? = null

    }
}