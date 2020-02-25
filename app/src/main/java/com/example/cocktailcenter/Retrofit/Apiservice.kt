package com.example.cocktailcenter.Retrofit

import com.example.cocktailcenter.Models.DrinkModel
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query
import java.util.*

interface Apiservice {
    @GET("search.php")
    suspend fun getCocktailsByType(
        @Query("s")
        cocktailType:String
    ): Response<DrinkModel>
}