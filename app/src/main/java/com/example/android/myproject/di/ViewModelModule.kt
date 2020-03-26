package com.example.android.myproject.di

import com.example.android.myproject.presentation.main.TeamViewModel
import com.example.android.myproject.presentation.login.LoginViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel {
        LoginViewModel(
            loginUseCase = get()
        )
    }

    viewModel {
        TeamViewModel(
            teamUseCase = get()
        )
    }
}