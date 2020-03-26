package com.example.android.myproject.database

import androidx.room.*

@Dao
interface UserDao {

    @Query("SELECT * FROM user WHERE login = :login AND password = :password")
    fun isUserExist(login: String, password: String): User?

    @Query("SELECT * FROM user WHERE name = :name OR login = :login")
    fun isNameOrLoginExist(name: String, login: String): MutableList<User>?

    @Insert
    fun insert(user: User)
}