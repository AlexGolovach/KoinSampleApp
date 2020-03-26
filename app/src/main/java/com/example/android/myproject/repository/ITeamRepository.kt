package com.example.android.myproject.repository

import com.example.android.myproject.network.model.Teams

interface ITeamRepository {

    suspend fun getTeams(): Teams?
}