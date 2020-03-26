package com.example.android.myproject.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class User(
    @PrimaryKey
    val id: String,
    val name: String,
    val login: String,
    val password: String
)