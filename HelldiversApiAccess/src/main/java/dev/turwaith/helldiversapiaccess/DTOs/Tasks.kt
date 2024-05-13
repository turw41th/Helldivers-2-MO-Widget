package dev.turwaith.helldiversapiaccess.DTOs

import com.google.gson.annotations.SerializedName

data class Tasks (
    @SerializedName("type"       ) var type       : Int?           = null,
    @SerializedName("values"     ) var values     : ArrayList<Int> = arrayListOf(),
    @SerializedName("valueTypes" ) var valueTypes : ArrayList<Int> = arrayListOf()

)