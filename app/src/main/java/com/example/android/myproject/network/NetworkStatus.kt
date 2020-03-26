package com.example.android.myproject.network

sealed class NetworkStatus<out T> {
    object Loading: NetworkStatus<Nothing>()
    class Success<out T>(val response: T): NetworkStatus<T>()
    object Error: NetworkStatus<Nothing>()
}