package com.example.jetpackapiquiz.model

import com.google.gson.annotations.SerializedName


data class Data (

    @SerializedName("status"  ) var status  : Boolean?         = null,
    @SerializedName("code"    ) var code    : Int?             = null,
    @SerializedName("message" ) var message : String?          = null,
    @SerializedName("items"   ) var items   : ArrayList<Items> = arrayListOf()


)