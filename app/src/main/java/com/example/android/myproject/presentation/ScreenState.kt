package com.example.android.myproject.presentation

sealed class ScreenState {
    object Loading: ScreenState()
    object Success: ScreenState()
    object Error: ScreenState()
}