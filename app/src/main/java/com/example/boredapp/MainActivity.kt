package com.example.boredapp

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.boredapp.ui.screens.MainScreen
import com.example.boredapp.ui.theme.BoredAppTheme

class MainActivity : ComponentActivity() {

    private var pressedTime: Long = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BoredAppTheme {
                MainScreen(this)
            }
        }
    }

    override fun onBackPressed() {
        if (pressedTime + 2000 > System.currentTimeMillis()) {
            super.onBackPressedDispatcher.onBackPressed()
            finish()
        } else {
            Toast.makeText(this, "Press back again to exit", Toast.LENGTH_LONG).show()
        }
        pressedTime = System.currentTimeMillis();
    }
}
