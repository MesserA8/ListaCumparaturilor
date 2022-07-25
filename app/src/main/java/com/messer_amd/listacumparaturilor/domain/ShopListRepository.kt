package com.messer_amd.listacumparaturilor.domain

import androidx.lifecycle.LiveData

interface ShopListRepository {

    fun addShopItem(shopItem: ShopItem) //add item

    fun deleteShopItem(shopItem: ShopItem) //delete item

    fun editShopItem(shopItem: ShopItem) //edit, redact item

    fun getShopItem(shopItemId: Int): ShopItem //get item by id

    fun getShopList(): LiveData<List<ShopItem>> //get list items
}