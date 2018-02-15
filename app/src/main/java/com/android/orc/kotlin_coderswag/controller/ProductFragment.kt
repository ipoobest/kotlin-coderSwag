package com.android.orc.kotlin_coderswag.controller

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.android.orc.kotlin_coderswag.R
import com.android.orc.kotlin_coderswag.utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.fragment_products.*

/**
 * Created by j.poobest on 15/2/2018 AD.
 */
class ProductFragment : Fragment() {

    companion object {
        fun newInstance() : ProductFragment{
            return  ProductFragment()
        }
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        val rootView: View = inflater
                ?.inflate(R.layout.fragment_products, container,false)!!
        innitInstance(rootView)
        return rootView
    }

    private fun innitInstance(rootView: View) {




    }
}