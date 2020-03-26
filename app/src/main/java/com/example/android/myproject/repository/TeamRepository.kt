package com.example.android.myproject.repository

import com.example.android.myproject.network.FootballApi
import com.example.android.myproject.network.model.Teams
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class TeamRepository(private val footballApi: FootballApi) : ITeamRepository {

    override suspend fun getTeams(): Teams? {
        return withContext(Dispatchers.IO) {
            val response = footballApi.listTeams()

            if (response.isSuccessful) {
                response.body()
            } else {
                null
            }
        }
    }
}