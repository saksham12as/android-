package com.littlelemon.menu

class FilterHelper {

    fun filterProducts(type: FilterType, productsList: List<ProductItem>): List<ProductItem> {
        return when (type) {
            FilterType.Economy -> productsList
            FilterType.Business -> productsList.filter { productItem -> productItem.category == "Business" }
            FilterType.FirstClass-> productsList.filter { productItem -> productItem.category == "First Class" }

        }
    }
}
