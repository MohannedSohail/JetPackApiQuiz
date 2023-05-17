package com.example.jetpackapiquiz.model

import com.google.gson.annotations.SerializedName


data class Rates (

  @SerializedName("id"         ) var id        : Int?    = null,
  @SerializedName("service_id" ) var serviceId : String? = null,
  @SerializedName("comment"    ) var comment   : String? = null,
  @SerializedName("rate"       ) var rate      : String? = null

)