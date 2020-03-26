package com.example.android.myproject.network

import com.example.android.myproject.network.model.Teams
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET

interface FootballApi {

    @GET("search_all_teams.php?l=English%20Premier%20League")
    suspend fun listTeams(): Response<Teams>
}