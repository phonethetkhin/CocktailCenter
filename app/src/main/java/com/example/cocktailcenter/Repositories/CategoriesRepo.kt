package com.example.cocktailcenter.Repositories

import androidx.lifecycle.MutableLiveData
import com.example.cocktailcenter.Models.CategoryModel

class CategoriesRepo {
      val mutableList= arrayListOf<CategoryModel>()
        lateinit var cm:CategoryModel
    var successlivedata = MutableLiveData<MutableList<CategoryModel>>()

    suspend fun getCategory()
    {
         cm = CategoryModel(1,"Vodka","https://www.thecocktaildb.com/images/media/drink/9179i01503565212.jpg")
        mutableList.add(0,cm)

        cm= CategoryModel(2,"Whisky","https://www.thecocktaildb.com/images/media/drink/yvvwys1461867858.jpg")
        mutableList.add(1,cm)

        cm= CategoryModel(3,"Gin","https://www.thecocktaildb.com/images/media/drink/xhl8q31504351772.jpg")
        mutableList.add(2,cm)

        cm= CategoryModel(4,"Wine","https://www.thecocktaildb.com/images/media/drink/txustu1473344310.jpg")
        mutableList.add(3,cm)

        cm= CategoryModel(5,"Martini","https://www.thecocktaildb.com/images/media/drink/71t8581504353095.jpg")
        mutableList.add(4,cm)

        cm= CategoryModel(6,"Margarita","https://www.thecocktaildb.com/images/media/drink/wpxpvu1439905379.jpg")
        mutableList.add(5,cm)

        cm= CategoryModel(7,"Rum","https://www.thecocktaildb.com/images/media/drink/bylfi21504886323.jpg")
        mutableList.add(6,cm)

        cm= CategoryModel(8,"Beer","https://www.thecocktaildb.com/images/media/drink/rsxuyr1472719526.jpg")
        mutableList.add(7,cm)
    successlivedata.postValue(mutableList)
    }


}