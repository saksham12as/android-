package com.littlelemon.menu

sealed class FilterType {
    object Economy : FilterType()
    object Business : FilterType()
    object FirstClass : FilterType()
}
