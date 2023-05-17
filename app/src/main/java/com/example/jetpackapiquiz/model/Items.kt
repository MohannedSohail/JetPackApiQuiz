package com.example.jetpackapiquiz.model
import com.google.gson.annotations.SerializedName



data class Items (
  
  @SerializedName("id"          ) var id         : Int?              = null,
  @SerializedName("customer_id" ) var customerId : String?           = null,
  @SerializedName("title"       ) var title      : String?           = null,
  @SerializedName("details"     ) var details    : String?           = null,
  @SerializedName("cover_image" ) var coverImage : String?           = null,
  @SerializedName("longitude"   ) var longitude  : String?           = null,
  @SerializedName("latitude"    ) var latitude   : String?           = null,
  @SerializedName("mobile"      ) var mobile     : String?           = null,
  @SerializedName("category_id" ) var categoryId : String?           = null,
  @SerializedName("city_id"     ) var cityId     : String?           = null,
  @SerializedName("created_at"  ) var createdAt  : String?           = null,

  @SerializedName("rates"       ) var rates      : ArrayList<Rates>  = arrayListOf()

)