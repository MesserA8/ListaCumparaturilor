package com.messer_amd.listacumparaturilor.presentation

import androidx.lifecycle.ViewModel
import com.messer_amd.listacumparaturilor.data.ShopListRepositoryImpl
import com.messer_amd.listacumparaturilor.domain.DeleteShopItemUseCase
import com.messer_amd.listacumparaturilor.domain.EditShopItemUseCase
import com.messer_amd.listacumparaturilor.domain.GetShopListUseCase

class MainViewModel : ViewModel() {

    private val repository = ShopListRepositoryImpl

    private val getShopListUseCase = GetShopListUseCase(repository)
    private val deleteShopItemUseCase = DeleteShopItemUseCase(repository)
    private val editShopItemUseCase = EditShopItemUseCase(repository)
}