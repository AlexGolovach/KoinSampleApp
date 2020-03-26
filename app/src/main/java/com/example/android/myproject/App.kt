package com.example.android.myproject

import android.app.Application
import com.example.android.myproject.di.*
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
            modules(
                listOf(
                    viewModelModule,
                    useCaseModule,
                    repositoryModule,
                    databaseModule,
                    retrofitModule
                )
            )
        }
    }
}