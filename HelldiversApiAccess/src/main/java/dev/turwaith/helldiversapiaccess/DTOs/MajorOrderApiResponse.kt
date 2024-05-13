package dev.turwaith.helldiversapiaccess.DTOs

import com.google.gson.annotations.SerializedName

data class MajorOrderApiResponse (
    @SerializedName("id32"      ) var id32      : Int?           = null,
    @SerializedName("progress"  ) var progress  : ArrayList<Int> = arrayListOf(),
    @SerializedName("expiresIn" ) var expiresIn : Int?           = null,
    @SerializedName("setting"   ) var setting   : Setting?       = Setting()
)