package com.example.cocktailcenter.ViewModels

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.cocktailcenter.Repositories.ProductShowcaseRepo
import kotlinx.coroutines.launch

class ProductViewModel() : ViewModel() {
    private val productshowcaserepo: ProductShowcaseRepo = ProductShowcaseRepo()
    val usersuccesslivedata = productshowcaserepo.usersSuccessLiveData

    fun getProductViewModels(context: Context, categoryname: String) {
        viewModelScope.launch {
            productshowcaserepo.getProducts(context, categoryname)
        }
    }
}