package com.android.orc.kotlin_coderswag.controller.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import com.android.orc.kotlin_coderswag.R
import com.android.orc.kotlin_coderswag.adapter.ProductAdapter
import com.android.orc.kotlin_coderswag.services.DataService
import com.android.orc.kotlin_coderswag.utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_product.*

class ProductActivity : AppCompatActivity() {

    lateinit var adapter: ProductAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)


        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        adapter = ProductAdapter(this, DataService.getProducts(categoryType))

        val layoutManager = GridLayoutManager(this, 2)
        recycler_view_product.layoutManager = layoutManager
        recycler_view_product.adapter = adapter


//    if (savedInstanceState == null){
//        supportFragmentManager.beginTransaction()
//                .add(R.id.content_product, ProductFragment.newInstance())
//                .commit()
//    }


    }
}

