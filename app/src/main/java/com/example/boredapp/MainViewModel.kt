package com.example.boredapp

import android.util.Log
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.boredapp.http.api.RetrofitBuilder
import com.example.boredapp.http.response.Activity
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {

    var activ= mutableStateOf(Activity("", "", 0, 0.0, "", "", ""))
    fun getActivity() = viewModelScope.launch {
        Log.d("test", "${activ.value}")
        activ.value = RetrofitBuilder.apiInterface.getActivity()
        Log.d("test", "${activ.value}")
    }
}