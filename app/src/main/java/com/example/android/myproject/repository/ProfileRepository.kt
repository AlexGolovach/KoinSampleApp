package com.example.android.myproject.repository

import com.example.android.myproject.database.User
import com.example.android.myproject.database.UserDao
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class ProfileRepository(private val userDao: UserDao) :
    IProfileRepository {

    override suspend fun addProfile(user: User): Boolean {
        return withContext(Dispatchers.IO) {
            if (isNameOrLoginExist(user)) {
                false
            } else {
                userDao.insert(user)

                true
            }
        }
    }

    override suspend fun checkIsUserExist(login: String, password: String): Boolean {
        return withContext(Dispatchers.IO) {
            val user = userDao.isUserExist(login, password)

            user != null
        }
    }

    private suspend fun isNameOrLoginExist(user: User): Boolean {
        return withContext(Dispatchers.IO) {
            val userList = userDao.isNameOrLoginExist(user.name, user.login)

            !userList.isNullOrEmpty()
        }
    }
}