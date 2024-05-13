package dev.turwaith.helldiversapiaccess.DTOs

import com.google.gson.annotations.SerializedName


data class Setting (
    @SerializedName("type"            ) var type            : Int?             = null,
    @SerializedName("overrideTitle"   ) var overrideTitle   : String?          = null,
    @SerializedName("overrideBrief"   ) var overrideBrief   : String?          = null,
    @SerializedName("taskDescription" ) var taskDescription : String?          = null,
    @SerializedName("tasks"           ) var tasks           : ArrayList<Tasks> = arrayListOf(),
    @SerializedName("reward"          ) var reward          : Reward?          = Reward(),
    @SerializedName("flags"           ) var flags           : Int?             = null

)