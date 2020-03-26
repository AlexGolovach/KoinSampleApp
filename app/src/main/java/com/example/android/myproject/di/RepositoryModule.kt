package com.example.android.myproject.di

import com.example.android.myproject.repository.IProfileRepository
import com.example.android.myproject.repository.ITeamRepository
import com.example.android.myproject.repository.ProfileRepository
import com.example.android.myproject.repository.TeamRepository
import org.koin.dsl.module

val repositoryModule = module {
    single<IProfileRepository> {
        ProfileRepository(
            userDao = get()
        )
    }

    single<ITeamRepository> {
        TeamRepository(
            footballApi = get()
        )
    }
}