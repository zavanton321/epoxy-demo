package ru.zavanton.moreepoxydemo.model

import androidx.annotation.DrawableRes

data class Cat(
    val breed: String = "",
    val description: String = "",
    @DrawableRes val image: Int = -1
)