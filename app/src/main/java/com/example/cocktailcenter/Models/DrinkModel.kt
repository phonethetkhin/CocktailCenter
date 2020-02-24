package com.example.cocktailcenter.Models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

 data class DrinkModel(@SerializedName("drinks")
                  @Expose
                  var drinks: List<Drink>? = null)


