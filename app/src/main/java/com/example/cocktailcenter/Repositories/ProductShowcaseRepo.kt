package com.example.cocktailcenter.Repositories

import android.content.Context
import android.widget.Toast
import androidx.lifecycle.MutableLiveData
import com.example.cocktailcenter.Models.DrinkModel
import com.example.cocktailcenter.Retrofit.Retrofitobj

class ProductShowcaseRepo {
    private val apiService = Retrofitobj.apiservice

    val usersSuccessLiveData = MutableLiveData<DrinkModel>()

    suspend fun getProducts(context: Context, categoryname: String) {
        val response = apiService.getCocktailsByType(categoryname)
        if (response.isSuccessful) {
            usersSuccessLiveData.postValue(response.body())
        } else {
            Toast.makeText(context, "Error Occured !!", Toast.LENGTH_SHORT).show()
        }
    }


}