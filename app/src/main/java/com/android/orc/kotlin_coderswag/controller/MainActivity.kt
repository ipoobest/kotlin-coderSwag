package com.android.orc.kotlin_coderswag.controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.android.orc.kotlin_coderswag.R
import com.android.orc.kotlin_coderswag.adapter.CategoryAdapter
import com.android.orc.kotlin_coderswag.model.Category
import com.android.orc.kotlin_coderswag.services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter :CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryAdapter(this,
                DataService.categories)
        categoryListView.adapter = adapter
    }
}
