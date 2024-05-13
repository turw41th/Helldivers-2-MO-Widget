package dev.turwaith.helldiversapiaccess.DTOs

import com.google.gson.annotations.SerializedName

data class Reward (
    @SerializedName("type"   ) var type   : Int? = null,
    @SerializedName("id32"   ) var id32   : Int? = null,
    @SerializedName("amount" ) var amount : Int? = null

)