package com.android.orc.kotlin_coderswag.controller.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.android.orc.kotlin_coderswag.R
import com.android.orc.kotlin_coderswag.controller.CategoryFragment

class MainActivity : AppCompatActivity() {

//    lateinit var adapter :CategoryAdapter
//    lateinit var adapter: CatagoryRecyclerViewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null){
            supportFragmentManager.beginTransaction()
                    .add(R.id.content_container, CategoryFragment.newInstance(),"fragment")
                    .commit()
        }


//        ListView
//        adapter = CategoryAdapter(this,
//                DataService.categories)
//        categoryListView.adapter = adapter

//        RecyclerView

//        adapter = CatagoryRecyclerViewAdapter(this, DataService.categories ){
//            category -> Toast.makeText(this, "$category.title", Toast.LENGTH_LONG).show()
//        }
//        categoryRecyclerView.adapter = adapter
//
//        val layoutManager = LinearLayoutManager(this)
//        categoryRecyclerView.layoutManager = layoutManager
//        categoryRecyclerView.setHasFixedSize(true)


    }
}
