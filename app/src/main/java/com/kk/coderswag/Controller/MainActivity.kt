package com.kk.coderswag.Controller

import android.content.AbstractThreadedSyncAdapter
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.kk.coderswag.Adapter.categoryAdapter
import com.kk.coderswag.Model.Category
import com.kk.coderswag.R
import com.kk.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: categoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        adapter = categoryAdapter(this,  DataService.categories)

        categoryListView.adapter =  adapter
    }
}
