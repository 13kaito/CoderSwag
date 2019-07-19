package com.kk.coderswag.Controller

import android.content.res.Configuration
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import com.kk.coderswag.Adapter.producAdapter
import com.kk.coderswag.R
import com.kk.coderswag.Services.DataService
import com.kk.coderswag.Utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_product.*

class ProductActivity : AppCompatActivity() {

    lateinit var adapter : producAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.setContentView(R.layout.activity_product)


        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        //println(categoryType)
        adapter = producAdapter(this, DataService.getProduct(categoryType))

        var spanCount = 2
        val orientation = resources.configuration.orientation //1: potrait 2:landscape

        if(orientation == Configuration.ORIENTATION_LANDSCAPE)
        {
            spanCount = 3
        }

        val screenSize = resources.configuration.screenWidthDp

        if (screenSize >720 )
        {
            if(orientation == Configuration.ORIENTATION_LANDSCAPE)
                spanCount = 4
            else
                spanCount = 3

        }

        val layoutManager = GridLayoutManager(this, spanCount)
        productListView.layoutManager = layoutManager
        productListView.adapter = adapter

    }
}
