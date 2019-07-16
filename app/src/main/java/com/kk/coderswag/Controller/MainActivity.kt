package com.kk.coderswag.Controller

import android.content.AbstractThreadedSyncAdapter
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.ArrayAdapter
import android.widget.Toast
import com.kk.coderswag.Adapter.CategoryRecycleAdapter
import com.kk.coderswag.Adapter.categoryAdapter
import com.kk.coderswag.Model.Category
import com.kk.coderswag.R
import com.kk.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: CategoryRecycleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        adapter = CategoryRecycleAdapter(this, DataService.categories)

        categoryListView.adapter =  adapter

        val layoutManager = LinearLayoutManager(this)
        categoryListView.layoutManager = layoutManager
        categoryListView.setHasFixedSize(true)
        /*
        categoryListView.setOnItemClickListener{adapterView, view, i, l ->
            val category = DataService.categories[i]
            Toast.makeText(this, "You clicked on the ${category.title} cecll", Toast.LENGTH_SHORT)

        }*/
    }
}
