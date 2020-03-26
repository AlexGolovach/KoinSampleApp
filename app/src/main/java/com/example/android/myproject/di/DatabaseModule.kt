package com.example.android.myproject.di

import androidx.room.Room
import com.example.android.myproject.database.AppDatabase
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val databaseModule = module {
    single { Room.databaseBuilder(androidContext(), AppDatabase::class.java, "RoomDb").build() }
    single { get<AppDatabase>().userDao() }
}