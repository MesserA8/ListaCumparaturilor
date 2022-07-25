package com.messer_amd.listacumparaturilor.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.messer_amd.listacumparaturilor.data.ShopListRepositoryImpl
import com.messer_amd.listacumparaturilor.domain.DeleteShopItemUseCase
import com.messer_amd.listacumparaturilor.domain.EditShopItemUseCase
import com.messer_amd.listacumparaturilor.domain.GetShopListUseCase
import com.messer_amd.listacumparaturilor.domain.ShopItem

class MainViewModel : ViewModel() {

    private val repository = ShopListRepositoryImpl

    private val getShopListUseCase = GetShopListUseCase(repository)
    private val deleteShopItemUseCase = DeleteShopItemUseCase(repository)
    private val editShopItemUseCase = EditShopItemUseCase(repository)

    val shopList = getShopListUseCase.getShopList()


    fun deleteShopItem(shopItem: ShopItem){
        deleteShopItemUseCase.deleteShopItem(shopItem)

    }

    fun changeEnabledState(shopItem: ShopItem){
        val newItem = shopItem.copy(enabled = !shopItem.enabled)
        editShopItemUseCase.editShopItem(newItem)

    }
}