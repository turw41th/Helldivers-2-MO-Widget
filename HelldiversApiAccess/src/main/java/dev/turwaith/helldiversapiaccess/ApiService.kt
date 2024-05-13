package dev.turwaith.helldiversapiaccess

import dev.turwaith.helldiversapiaccess.DTOs.MajorOrderApiResponse
import retrofit2.http.GET
import retrofit2.Call

interface ApiService {
    @GET("raw/api/v2/Assignment/War/801")
    fun fetchMajorOrder(): Call<List<MajorOrderApiResponse>>
}
