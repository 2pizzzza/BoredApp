package com.example.boredapp.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun ItemMainScreen(value:String) {
    Box(
        modifier = Modifier
            .padding()
            .height(70.dp)
            .width(300.dp)
            .border(1.dp, Color.Black)
            .background(Color.White),
        contentAlignment = Alignment.Center
    ){
        Text(
            text = value,
            style = TextStyle(
                textAlign = TextAlign.Center
            )
        )
    }
}