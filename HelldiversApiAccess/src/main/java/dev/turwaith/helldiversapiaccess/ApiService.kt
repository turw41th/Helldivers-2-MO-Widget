package dev.turwaith.helldiversapiaccess

import dev.turwaith.helldiversapiaccess.DTOs.MajorOrderApiResponse
import retrofit2.http.GET
import retrofit2.Call
import retrofit2.http.Headers

interface ApiService {
    @Headers("X-Super-Client: MajorOrderTrackerWidget")
    @GET("raw/api/v2/Assignment/War/801")
    fun fetchMajorOrder(): Call<List<MajorOrderApiResponse>>
}
