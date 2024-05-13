package dev.turwaith.helldiversapiaccess

import dev.turwaith.helldiversapiaccess.DTOs.MajorOrderApiResponse
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ApiAccess {
    private val retrofit: Retrofit = Retrofit.Builder()
        .baseUrl("https://api.helldivers2.dev/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    private val service: ApiService = retrofit.create(ApiService::class.java)

    fun getMajorOrderData(): List<MajorOrderApiResponse>? {
        val call = service.fetchMajorOrder()
        return try {
            val response = call.execute()
            if (response.isSuccessful) {
                response.body()
            } else {
                null // Log error or handle it as needed
            }
        } catch (e: Exception) {
            e.printStackTrace()
            null
        }
    }
}