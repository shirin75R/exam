package com.shirin.myapp

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface ApiInterface {
    @GET("character")
    fun getCharacter(): Call<QuoteList>

    companion object {
        val BASE_URL = "https://rickandmortyapi.com/api/"

        fun create (): ApiInterface {

            val retrofit = Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(BASE_URL)
                .build()
            val retro = retrofit.create(ApiInterface::class.java)
            return retro

        }
    }
}