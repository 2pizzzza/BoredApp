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
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.boredapp.MainViewModel

@Composable
fun MainScreen(
    viewModel: MainViewModel= viewModel()
) {
    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = "Your Activity", fontSize = 40.sp)
            Text(text = "Activity")
            OutlinedTextField(value = viewModel.activ.value!!.activity, onValueChange = {}, readOnly = true, label = {})

            Text(text = "Type")
            OutlinedTextField(value = viewModel.activ.value!!.type, onValueChange = {}, readOnly = true, label = {})

            Text(text = "Participants")
            OutlinedTextField(value = "${viewModel.activ.value!!.participants}", onValueChange = {}, readOnly = true, label = {})

            Text(text = "Price")
            OutlinedTextField(value = "${viewModel.activ.value!!.price}", onValueChange = {}, readOnly = true, label = {})

            Text(text = "Accessibility")
            OutlinedTextField(value = viewModel.activ.value!!.accessibility, onValueChange = {}, readOnly = true, label = {})

            Text(text = "Link")
            OutlinedTextField(value = viewModel.activ.value!!.link, onValueChange = {}, readOnly = true, label = {})

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