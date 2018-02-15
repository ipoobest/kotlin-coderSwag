package com.android.orc.kotlin_coderswag.controller

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.android.orc.kotlin_coderswag.R
import com.android.orc.kotlin_coderswag.adapter.CatagoryRecyclerViewAdapter
import com.android.orc.kotlin_coderswag.controller.activity.ProductActivity
import com.android.orc.kotlin_coderswag.services.DataService
import com.android.orc.kotlin_coderswag.utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.fragment_category.*

/**
 * Created by j.poobest on 15/2/2018 AD.
 */
class CategoryFragment : Fragment() {

    lateinit var adapter: CatagoryRecyclerViewAdapter

    companion object {
        fun newInstance(): CategoryFragment {
            return CategoryFragment()
        }
    }


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        Toast.makeText(context, "hi", Toast.LENGTH_LONG).show()
        val rootView: View = inflater?.inflate(R.layout.fragment_category, container, false)!!
        initInstances(rootView)
        return rootView

    }

    private fun initInstances(rootView: View?) {

        adapter = CatagoryRecyclerViewAdapter(context, DataService.categories) { category ->
            val productIntent = Intent(context, ProductActivity::class.java)
            productIntent.putExtra(EXTRA_CATEGORY, category.title)
            startActivity(productIntent)
        }

        val recyclerView = rootView!!.findViewById(R.id.categoryRecyclerView) as RecyclerView

        recyclerView.adapter = adapter

        val layoutManager = LinearLayoutManager(context)
        recyclerView.layoutManager = layoutManager
        recyclerView.setHasFixedSize(true)


    }


}