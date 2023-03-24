package com.shirin.myapp

import android.telecom.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface QuotesApi {
    @GET("character.json")
    fun getInfo() : Call<List<??>>

    companion object {
        var BASE_URL = "https://rickandmortyapi.com/api/character"

        fun create() : QuotesApi {

            val retrofit = Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(BASE_URL)
                .build()
            return retrofit.create(QuotesApi::class.java)

        }
    }
}