package com.messer_amd.listacumparaturilor.domain

interface ShopListRepository {

    fun addShopItem(shopItem: ShopItem) //add item

    fun deleteShopItem(shopItem: ShopItem) //delete item

    fun editShopItem(shopItem: ShopItem) //edit, redact item

    fun getShopItem(shopItemId: Int): ShopItem //get item by id

    fun getShopList(): List<ShopItem> //get list items
}