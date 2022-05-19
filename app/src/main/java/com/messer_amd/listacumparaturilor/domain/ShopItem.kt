package com.messer_amd.listacumparaturilor.domain

data class ShopItem(
    val name: String,
    val count: Float,
    val enabled: Boolean,
    var id: Int = -1
)