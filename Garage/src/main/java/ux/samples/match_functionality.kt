package ux.samples

import android.annotation.SuppressLint
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.detectDragGestures
import androidx.compose.foundation.gestures.detectHorizontalDragGestures
import androidx.compose.foundation.gestures.rememberScrollableState
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PagerState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalFoundationApi::class)
@Preview
@Composable
fun WhiteRectangleWithButton() {
    BoxWithConstraints(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        val text="Rust Developer"
        val cvOn= remember {
            mutableStateOf(false)
        }
        val couler= listOf<Color>(Color.White,Color.Cyan,Color.Green, Color.Red)
        val my_height=maxHeight / 7 * 4
        val my_width=maxWidth / 7 * 5
        fun rotatePag (page:Int){
            cvOn.value=!cvOn.value
        }
Column(Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center) {
        HorizontalPager(pageCount = 4, userScrollEnabled = !cvOn.value) { page ->
            val col=couler[page]
            if (cvOn.value==false){
                Box(modifier = Modifier
                    .clickable { rotatePag(page) }
                    .background(col)
                    .height(my_height)
                    .width(my_width)
                )}
            else{
                Box(modifier = Modifier
                    .clickable { rotatePag(page) }
                    .background(Color.Black)
                    .height(my_height)
                    .width(my_width)
                ){ Text(text = text)}
            }
        }

            Button(
                onClick = { /* Действие при нажатии кнопки */ },
                modifier = Modifier
                    .padding(top = 16.dp)
                    .align(CenterHorizontally)
            ) {
                Text(text = "Apply")
            }

        Button(
            onClick = { /* Действие при нажатии кнопки */ },
            modifier = Modifier
                .padding(top = 16.dp)
                .align(CenterHorizontally)
        ) {
            Text(text = "Ignore")
        }
    }}
}



