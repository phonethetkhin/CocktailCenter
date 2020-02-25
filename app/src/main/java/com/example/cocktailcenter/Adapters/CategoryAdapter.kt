package com.example.cocktailcenter.Adapters

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.cocktailcenter.Models.CategoryModel
import com.example.cocktailcenter.R
import com.example.cocktailcenter.Views.ProductShowcase
import com.squareup.picasso.Picasso

class CategoryAdapter(val categorylist: List<CategoryModel>) :
    RecyclerView.Adapter<CategoryAdapter.ViewHolder>() {

    class ViewHolder(v: View) : RecyclerView.ViewHolder(v) {
        val tvCategoryName: TextView = v.findViewById(R.id.tvCategoryName)
        val imgPhoto: ImageView = v.findViewById(R.id.imgPhoto)
        val cvCategory:CardView=v.findViewById(R.id.cvCategory)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.categorieslistitem, parent, false)
        return ViewHolder(view)

    }

    override fun getItemCount(): Int {
        return categorylist.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tvCategoryName.text = categorylist[position].categoryname
        Picasso.get().load(categorylist[position].categoryPhoto).placeholder(R.drawable.placeholder)
            .into(holder.imgPhoto)
        holder.cvCategory.setOnClickListener {
            val i:Intent=Intent(it.context,ProductShowcase::class.java)
            i.putExtra("categoryname",categorylist[position].categoryname)
            it.context.startActivity(i)

        }

    }
}