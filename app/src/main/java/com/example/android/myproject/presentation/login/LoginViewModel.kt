package com.example.android.myproject.presentation.login

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.android.myproject.presentation.ScreenState
import com.example.android.myproject.database.User
import com.example.android.myproject.presentation.BaseViewModel
import com.example.android.myproject.presentation.login.usecase.ILoginUseCase
import kotlinx.coroutines.launch

class LoginViewModel(private val loginUseCase: ILoginUseCase) : BaseViewModel() {

    private val databaseOperationState = MutableLiveData<ScreenState>()

    val state: LiveData<ScreenState>
        get() = databaseOperationState

    fun addProfile(user: User) {
        databaseOperationState.value = ScreenState.Loading

        launch {
            when (loginUseCase.addNewProfile(user)) {
                true -> databaseOperationState.value = ScreenState.Success
                else -> databaseOperationState.value = ScreenState.Error
            }
        }
    }

    fun checkIsUserExist(login: String, password: String) {
        databaseOperationState.value = ScreenState.Loading

        launch {
            when (loginUseCase.checkIsUserExist(login, password)) {
                true -> databaseOperationState.value = ScreenState.Success
                else -> databaseOperationState.value = ScreenState.Error
            }
        }
    }
}