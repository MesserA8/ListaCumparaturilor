package com.messer_amd.listacumparaturilor.domain

class AddShopItemUseCase(private val shopListRepository: ShopListRepository) {

    fun addShopItem(shopItem: ShopItem){
            shopListRepository.addShopItem(shopItem)
    }
}