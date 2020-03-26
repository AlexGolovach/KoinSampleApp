package com.example.android.myproject.di

import com.example.android.myproject.presentation.login.usecase.ILoginUseCase
import com.example.android.myproject.presentation.login.usecase.LoginUseCase
import com.example.android.myproject.presentation.main.usecase.ITeamUseCase
import com.example.android.myproject.presentation.main.usecase.TeamUseCase
import org.koin.dsl.module

val useCaseModule = module {
    single<ILoginUseCase> {
        LoginUseCase(
            profileRepository = get()
        )
    }

    single<ITeamUseCase> {
        TeamUseCase(
            teamRepository = get()
        )
    }
}