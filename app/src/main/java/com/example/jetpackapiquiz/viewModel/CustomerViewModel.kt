package com.example.myapplication.viewModel

import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.jetpackapiquiz.model.Data
import com.example.jetpackapiquiz.model.Items
import com.example.myapplication.network.ApiService


import kotlinx.coroutines.launch

class CustomerViewModel : ViewModel() {

     var customerListResponse:List<Items> by mutableStateOf(listOf())

    fun getItemsList() {
        viewModelScope.launch {
            val apiService =  ApiService.getInstance()
                val itemList = apiService.getData()
            customerListResponse = itemList.items



        }
    }
}