package com.kk.coderswag.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.kk.coderswag.Model.Category
import com.kk.coderswag.R
import java.text.FieldPosition

class categoryAdapter(val context: Context, val categories: List<Category>) : BaseAdapter() {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val categoryView:View
        val holder:ViewHolder


        if(convertView == null){

            categoryView = LayoutInflater.from(context).inflate(R.layout.category_list_item, null)
            holder = ViewHolder()
            holder.CategoryImage = categoryView.findViewById(R.id.categoryImg)
            holder.CategoryName = categoryView.findViewById(R.id.categoryName)

            categoryView.tag = holder
        } else {
            holder = convertView.tag as ViewHolder
            categoryView = convertView
        }


        val category = categories[position]

        val resourcesId = context.resources.getIdentifier(category.image, "drawable", context.packageName)

        holder.CategoryImage?.setImageResource(resourcesId)
        holder.CategoryName?.text = category.title


        return categoryView
    }

    override fun getItem(position: Int): Any {
        return categories[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return categories.count()
    }

    private class ViewHolder{
        var CategoryImage:ImageView? = null
        var CategoryName:TextView? = null
    }
}