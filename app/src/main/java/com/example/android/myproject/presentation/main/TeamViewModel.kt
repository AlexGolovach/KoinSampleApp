package com.example.android.myproject.presentation.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.android.myproject.network.NetworkStatus
import com.example.android.myproject.network.model.Teams
import com.example.android.myproject.presentation.BaseViewModel
import com.example.android.myproject.presentation.main.usecase.ITeamUseCase
import kotlinx.coroutines.launch

class TeamViewModel(private val teamUseCase: ITeamUseCase) : BaseViewModel() {

    private val loadTeamsState = MutableLiveData<NetworkStatus<Teams>>()

    val state: LiveData<NetworkStatus<Teams>>
        get() = loadTeamsState

    fun getTeamList() {
        loadTeamsState.value = NetworkStatus.Loading

        launch {
            when (val list = teamUseCase.getTeamsList()) {
                null -> loadTeamsState.value = NetworkStatus.Error
                else -> loadTeamsState.value = NetworkStatus.Success(list)
            }
        }
    }
}