package com.kk.coderswag.Adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.kk.coderswag.Model.Category
import com.kk.coderswag.R
import kotlinx.android.synthetic.main.category_list_item.view.*

class CategoryRecycleAdapter (val context : Context, val categories : List<Category>) : RecyclerView.Adapter<CategoryRecycleAdapter.Holder>() {

    override fun onCreateViewHolder(parent: ViewGroup, ViewGroup: Int): Holder {
        val view = LayoutInflater.from(parent?.context)
            .inflate(R.layout.category_list_item,parent, false)
        return Holder(view)
    }

    override fun getItemCount(): Int {
        return categories.count()
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder?.bindCategory(categories[position], context)
    }


    inner class Holder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val categoryImage = itemView.findViewById<ImageView>(R.id.categoryImg)
        val categoryName = itemView.findViewById<TextView>(R.id.categoryName)

        fun bindCategory(category: Category, context: Context){
            val resourceid = context.resources.getIdentifier(category.image, "drawable", context.packageName)

            categoryImage?.setImageResource(resourceid)
            categoryName?.text = category.title
        }
    }
}