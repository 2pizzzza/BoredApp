package com.example.boredapp.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showSystemUi = true)
@Composable
fun MainScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = "Your Activity", fontSize = 40.sp)
            Text(text = "Your Activity")
            OutlinedTextField(value = "", onValueChange = {}, readOnly = true, label = {})

            Text(text = "Your Activity")
            OutlinedTextField(value = "", onValueChange = {}, readOnly = true, label = {})

            Text(text = "Your Activity")
            OutlinedTextField(value = "", onValueChange = {}, readOnly = true, label = {})

            Text(text = "Your Activity")
            OutlinedTextField(value = "", onValueChange = {}, readOnly = true, label = {})

            Text(text = "Your Activity")
            OutlinedTextField(value = "", onValueChange = {}, readOnly = true, label = {})

            Text(text = "Your Activity")
            OutlinedTextField(value = "", onValueChange = {}, readOnly = true, label = {})

            Text(text = "Your Activity")
            OutlinedTextField(value = "", onValueChange = {}, readOnly = true, label = {})

            Button(
                modifier = Modifier
                    .padding(top = 20.dp),
                onClick = { /*

                */
                }) {
                Text(text = "Get activity")
            }
        }

    }
}