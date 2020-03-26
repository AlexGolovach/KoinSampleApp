package com.example.android.myproject.di

import com.example.android.myproject.network.FootballApi
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

const val BASE_URL = "https://www.thesportsdb.com/api/v1/json/1/"

val retrofitModule = module {
    single { createNetworkService<FootballApi>() }
}

inline fun <reified T> createNetworkService(): T {
    val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    return retrofit.create(T::class.java)
}