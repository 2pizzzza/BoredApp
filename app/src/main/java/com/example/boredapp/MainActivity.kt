package com.example.boredapp

import android.os.Build
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.boredapp.ui.theme.BoredAppTheme

class MainActivity : ComponentActivity() {

    private var pressedTime: Long = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BoredAppTheme {
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.Black)
                ){
                    Text(
                        text = "HELLO BRUDER!!!!!",
                        style = TextStyle(color = Color.White, fontSize = 50.sp)
                    )
                }
            }
        }
    }

    override fun onBackPressed() {
        if (pressedTime + 2000 > System.currentTimeMillis()){
            super.onBackPressedDispatcher.onBackPressed()
            finish()
        }else{
            Toast.makeText(this, "Press back again to exit", Toast.LENGTH_LONG).show()
        }
        pressedTime = System.currentTimeMillis();
    }
}
