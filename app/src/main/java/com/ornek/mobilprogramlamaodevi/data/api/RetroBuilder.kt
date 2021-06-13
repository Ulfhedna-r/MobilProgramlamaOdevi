package com.ornek.mobilprogramlamaodevi.data.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetroBuilder {
    private const val BASE_URL ="https://5e510330f2c0d300147c034c.mockapi.io"

    private fun getRetroFit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val apiService: ApiService = getRetroFit().create(ApiService::class.java)

}