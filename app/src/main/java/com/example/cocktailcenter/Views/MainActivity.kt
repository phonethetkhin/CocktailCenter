package com.example.cocktailcenter.Views

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.cocktailcenter.Adapters.CategoryAdapter
import com.example.cocktailcenter.R
import com.example.cocktailcenter.ViewModels.CategoriesViewmodels
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var categoryviewmodel: CategoriesViewmodels

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvMain.layoutManager = GridLayoutManager(this, 2, RecyclerView.VERTICAL, false)
        rvMain.setHasFixedSize(true)

        categoryviewmodel = ViewModelProviders.of(this).get(CategoriesViewmodels::class.java)
        categoryviewmodel.getCategories()
        categoryviewmodel.successlivedata.observe(this, Observer { userlist ->
            userlist?.let {
                rvMain.adapter = CategoryAdapter(userlist)

            }
        })


    }
}
