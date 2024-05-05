package com.example.boredapp.ui.components

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.boredapp.R

val imgList = listOf(
    PagerItemData(R.drawable.splash_dog, "Книги это наше всё!"),
    PagerItemData(R.drawable.ic_launcher_background, "Книги это наше всё!"),
    PagerItemData(R.drawable.splash_dog, "Книги это наше всё!")
)

@Composable
fun PagerItem(
    page: Int,
    onClickToScreen: () -> Unit
) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = imgList[page].img),
                contentDescription = ""
            )
            Text(
                text = imgList[page].text,
                style = TextStyle(
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Normal
                )
            )
        }

        Button(
            modifier = Modifier
                .alpha(
                    when (page) {
                        2 -> 1f
                        else -> 0f
                    }
                )
                .padding(top = 500.dp),
            onClick = {
                onClickToScreen()
            }) {
            Text(text = "Go")
        }
    }
}


@OptIn(ExperimentalFoundationApi::class)
@Preview(showSystemUi = true)
@Composable
fun PagerPreview() {
    Image(
        modifier = Modifier
            .fillMaxSize(),
        contentScale = ContentScale.FillBounds,
        painter = painterResource(id = R.drawable.bg_img),
        contentDescription = "bg_img"
    )
    val pageState = rememberPagerState(pageCount = { 3 })
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        HorizontalPager(state = pageState) { page ->
            PagerItem(page = page) {
            }
        }
    }
}

data class PagerItemData(
    val img: Int,
    val text: String
)