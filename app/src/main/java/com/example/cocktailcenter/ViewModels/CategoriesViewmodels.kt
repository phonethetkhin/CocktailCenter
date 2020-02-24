package com.example.cocktailcenter.ViewModels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.cocktailcenter.Repositories.CategoriesRepo
import kotlinx.coroutines.launch

class CategoriesViewmodels : ViewModel() {
    private val CategoriesRepo = CategoriesRepo()
    val successlivedata = CategoriesRepo.successlivedata

    fun getCategories() {
        viewModelScope.launch {
            CategoriesRepo.getCategory()

        }
    }

}