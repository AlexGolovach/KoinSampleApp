package com.example.android.myproject.presentation.main.usecase

import com.example.android.myproject.network.model.Teams

interface ITeamUseCase {

    suspend fun getTeamsList(): Teams?
}