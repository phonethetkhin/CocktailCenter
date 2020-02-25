package com.example.cocktailcenter.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.cocktailcenter.Models.Drink
import com.example.cocktailcenter.Models.DrinkModel
import com.example.cocktailcenter.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.productlistitem.view.*

class ProductsAdapter(val drinklist:List<Drink>) : RecyclerView.Adapter<ProductsAdapter.ViewHolder>() {

    class ViewHolder(v: View) : RecyclerView.ViewHolder(v)
    {
        val tvName:TextView=v.findViewById(R.id.tvName)
        val tvCategory:TextView=v.findViewById(R.id.tvCategory)
        val imgPhoto:ImageView=v.findViewById(R.id.imgPhoto)
        val cvProductCardView:CardView=v.findViewById(R.id.cvProductCardView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
val v:View=LayoutInflater.from(parent.context).inflate(R.layout.productlistitem,parent,false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return drinklist.size

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

    holder.tvName.text=drinklist[position].strDrink
        holder.tvCategory.text=drinklist[position].strCategory
        Picasso.get().load(drinklist[position].strDrinkThumb).placeholder(R.drawable.placeholder).into(holder.imgPhoto)

        holder.cvProductCardView.setOnClickListener {

        }
    }

}