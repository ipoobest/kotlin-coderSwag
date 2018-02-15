package com.android.orc.kotlin_coderswag.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.android.orc.kotlin_coderswag.R
import com.android.orc.kotlin_coderswag.holder.CategotyHolder
import com.android.orc.kotlin_coderswag.model.Category

/**
 * Created by j.poobest on 13/2/2018 AD.
 */
class CatagoryRecyclerViewAdapter( val context: Context, val category: List<Category>, val itemClick: (Category)->Unit) : RecyclerView.Adapter<CategotyHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): CategotyHolder {

        val view = LayoutInflater.from(parent?.context)
                .inflate(R.layout.category_list_item, parent, false)

        return CategotyHolder(view, itemClick)

    }

    override fun getItemCount(): Int {
        return category.count()
    }

    override fun onBindViewHolder(holder: CategotyHolder?, position: Int) {
        holder?.bindCategory(category[position], context)


    }


}



