package com.example.jetpackapiquiz

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.clickable
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.jetpackapiquiz.model.Data
import com.example.jetpackapiquiz.model.Items
import com.example.myapplication.view.CustomerItem
import com.example.myapplication.viewModel.CustomerViewModel

class MainActivity : ComponentActivity() {

    val customerViewModel by viewModels<CustomerViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            DataList(myWorkList = customerViewModel.customerListResponse){

            }

            customerViewModel.getItemsList()

        }
    }
}

@Composable
fun DataList(myWorkList: List<Items>, selectedItem: (Items) -> Unit) {
    LazyColumn {
        itemsIndexed(items = myWorkList) { index, item ->
            Surface(modifier = Modifier.clickable { selectedItem(item) }) {
                CustomerItem(data = item)

            }
        }

    }
}
