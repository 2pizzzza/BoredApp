package com.example.boredapp.ui.screens

import android.content.Context
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.boredapp.MainViewModel
import com.example.boredapp.ui.components.ItemMainScreen

@Composable
fun MainScreen(
    context: Context,
    viewModel: MainViewModel = viewModel()
) {
    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = "Your Activity", fontSize = 40.sp)
            Text(text = "Activity")
            ItemMainScreen(value = viewModel.activ.value.activity)

            Text(text = "Type")
            ItemMainScreen(value = viewModel.activ.value.type)

            Text(text = "Participants")
            ItemMainScreen(value = "${viewModel.activ.value.participants}")

            Text(text = "Price")
            ItemMainScreen(value = "${viewModel.activ.value.price}")

            Text(text = "Accessibility")
            ItemMainScreen(value = viewModel.activ.value.accessibility)

            Text(text = "Link")
            Box(
                modifier = Modifier
                    .padding()
                    .height(70.dp)
                    .width(300.dp)
                    .border(1.dp, Color.Black)
                    .background(Color.White),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = viewModel.activ.value.link,
                    style = TextStyle(
                        textAlign = TextAlign.Center,
                        fontSize = 17.sp
                    ),
                    modifier = Modifier
                        .clickable {
                            viewModel.openUrlInBrowser(context, viewModel.activ.value.link)
                        }
                )
            }
            Button(
                modifier = Modifier
                    .padding(top = 20.dp),
                onClick = {
                    viewModel.getActivity()
                }) {
                Text(text = "Get activity")
            }
        }

    }
}
