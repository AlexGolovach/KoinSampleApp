package com.example.android.myproject.presentation.login.usecase

import com.example.android.myproject.database.User
import com.example.android.myproject.repository.IProfileRepository

class LoginUseCase(private val profileRepository: IProfileRepository) : ILoginUseCase {

    override suspend fun addNewProfile(user: User) = profileRepository.addProfile(user)

    override suspend fun checkIsUserExist(login: String, password: String) =
        profileRepository.checkIsUserExist(login, password)
}