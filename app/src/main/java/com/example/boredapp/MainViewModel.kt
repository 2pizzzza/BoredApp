package com.example.boredapp

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.util.Log
import android.widget.Toast
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.boredapp.http.api.RetrofitBuilder
import com.example.boredapp.http.response.Activity
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {

    var activ = mutableStateOf(Activity("", "", 0, 0.0, "", "", ""))
    fun getActivity() = viewModelScope.launch {
        Log.d("test", "${activ.value}")
        activ.value = RetrofitBuilder.apiInterface.getActivity()
        Log.d("test", "${activ.value}")
    }

    fun openUrlInBrowser(context: Context, url: String) {
        if (url.isNotEmpty()) {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            context.startActivity(intent)
        } else {
            Toast.makeText(context, "Url is empty", Toast.LENGTH_LONG).show()
        }
    }
}