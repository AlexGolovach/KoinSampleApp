package com.example.android.myproject.presentation.login.usecase

import com.example.android.myproject.database.User

interface ILoginUseCase {

    suspend fun addNewProfile(user: User): Boolean

    suspend fun checkIsUserExist(login: String, password: String): Boolean
}