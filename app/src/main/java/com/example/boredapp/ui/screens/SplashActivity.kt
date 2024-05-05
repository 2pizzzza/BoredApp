package com.example.boredapp.ui.screens

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.boredapp.MainActivity
import com.example.boredapp.R
import com.example.boredapp.ui.theme.BoredAppTheme
import kotlinx.coroutines.delay


@SuppressLint("CustomSplashScreen")
class SplashActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BoredAppTheme {
                SplashScreen()
            }
        }
    }

    @OptIn(ExperimentalFoundationApi::class)
    @Preview(showSystemUi = true)
    @Composable
    private fun SplashScreen() {
        val pageState = rememberPagerState(pageCount = { 3 })
//        LaunchedEffect(key1 = true) {
//            startActivity(Intent(this@SplashActivity, MainActivity::class.java).apply {
//                addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK)
//            })
//            finish()
//        }
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier.fillMaxSize()
        ) {
            HorizontalPager(state = pageState) { page ->
                Column {
                    Text(
                        text = "$page, pagwer",
                        modifier = Modifier.fillMaxWidth()
                    )
                    if (page == 2) {
                        Button(onClick = {
                            startActivity(Intent(
                                this@SplashActivity,
                                MainActivity::class.java).apply {
                                    addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK)
                            })
                            finish()
                        }) {
                            Text(text = "i am spider man")
                        }
                    }
                }
            }

        }
    }
}
