package com.example.android.myproject.presentation.main.usecase

import com.example.android.myproject.repository.ITeamRepository

class TeamUseCase(private val teamRepository: ITeamRepository):
    ITeamUseCase {

    override suspend fun getTeamsList() = teamRepository.getTeams()
}