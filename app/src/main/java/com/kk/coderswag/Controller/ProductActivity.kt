package com.kk.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.kk.coderswag.R
import com.kk.coderswag.Utilities.EXTRA_CATEGORY

class ProductActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.setContentView(R.layout.activity_product)


        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        println(categoryType)
    }
}
