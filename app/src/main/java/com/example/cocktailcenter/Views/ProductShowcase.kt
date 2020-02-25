package com.example.cocktailcenter.Views

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.cocktailcenter.Adapters.ProductsAdapter
import com.example.cocktailcenter.R
import com.example.cocktailcenter.ViewModels.ProductViewModel

class ProductShowcase : AppCompatActivity() {
    lateinit var pvm: ProductViewModel
    lateinit var rvProducts: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_showcase)
        rvProducts=findViewById(R.id.rvProducts)
        val intent = getIntent()
        val name = intent.getStringExtra("categoryname")
        rvProducts.layoutManager = GridLayoutManager(this, 2, RecyclerView.VERTICAL, false)
        rvProducts.setHasFixedSize(true)


        pvm = ViewModelProviders.of(this).get(ProductViewModel::class.java)


registerObserver()
        pvm.getProductViewModels(this,name)


    }

    private fun registerObserver()
    {
        pvm.usersuccesslivedata.observe(this, Observer {productlist->
            productlist?.let {
                rvProducts.adapter = ProductsAdapter(it.drinks)

            }

        })
    }
}
