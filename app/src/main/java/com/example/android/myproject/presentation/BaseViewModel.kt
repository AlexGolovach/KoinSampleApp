package com.example.android.myproject.presentation

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlin.coroutines.CoroutineContext

abstract class BaseViewModel : ViewModel(), CoroutineScope {

    private val coroutineScopeJob = Job()
    override val coroutineContext: CoroutineContext
        get() = Dispatchers.Main + coroutineScopeJob

    override fun onCleared() {
        super.onCleared()
        coroutineScopeJob.cancel()
    }
}