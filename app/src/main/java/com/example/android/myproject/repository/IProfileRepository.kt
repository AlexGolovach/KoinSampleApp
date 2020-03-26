package com.example.android.myproject.repository

import com.example.android.myproject.database.User

interface IProfileRepository {

    suspend fun addProfile(user: User): Boolean

    suspend fun checkIsUserExist(login: String, password: String): Boolean
}