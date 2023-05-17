package ux.pages

import android.annotation.SuppressLint
import android.icu.text.ListFormatter.Width
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ux.components.New_post
import ux.components.icons
import androidx.compose.ui.unit.*
import ux.components.Search
import ux.components.menu_func

@SuppressLint("SuspiciousIndentation")
@Preview(showBackground = true)
@Composable
fun head() {
    val search_text= remember {
        mutableStateOf("")
    }
    val menuOpenState = remember { mutableStateOf(false) }
    val searchOpenState = remember { mutableStateOf(false) }
    val menuWidth = if (menuOpenState.value) 1f else 0f

    Column(
        Modifier
            .background(Color.Gray)
            .fillMaxSize()
    ) {
        Row(
            Modifier
                .height(50.dp)
                .fillMaxWidth()
                .background(Color.LightGray),
            verticalAlignment = Alignment.CenterVertically
        ) {
            icons(icn = Icons.Filled.Menu, onClick = { menuOpenState.value = !menuOpenState.value })
            if (searchOpenState.value==false){Column(Modifier.weight(1f)) {
                Text(
                    text = "Garage",
                    color = Color.DarkGray,
                    modifier = Modifier.align(CenterHorizontally)
                )
                Text(
                    "Open Mind Platform",
                    color = Color.Black,
                    modifier = Modifier.align(CenterHorizontally)
                )
            }}
            else{
                Search(Primary_Text = search_text,Modifier.weight(1f))}
            icons(icn = Icons.Filled.Search, onClick = { searchOpenState.value = !searchOpenState.value })
        }

        if (menuOpenState.value) {
            Row(Modifier.fillMaxSize()) {


            Box(
                modifier = Modifier
                    .background(Color.LightGray)
                    .fillMaxHeight()
                    .width((menuWidth * 100.dp))
            ) {
                menu_func()
            }
            Box(modifier = Modifier
                .background(Color.DarkGray)
                .fillMaxSize()
            ){
                val tex="Garage!"
                    Column(Modifier.fillMaxSize(),horizontalAlignment = CenterHorizontally, verticalArrangement = Arrangement.Center) {
                        for (i in tex ){
                            Text(text = i.toString(), textAlign = TextAlign.End, color = Color.White)
                            Text(text = "")
                        }
                        
                    }
                }
            }
        }



        Box(modifier = Modifier
            .background(Color.LightGray)
            .height(3.dp)
            .fillMaxWidth()
            .padding(bottom = 10.dp)
        )
        Row(modifier = Modifier.height(30.dp)) {
            // Дополнительный контент, если необходимо
        }
        for (i in 0..5) {
            Card(
                backgroundColor = Color.White, modifier = Modifier
                    .padding(10.dp)
                    .height(80.dp)
                    .fillMaxWidth()
            ) {
                Column(Modifier.fillMaxSize()) {
                    Text(modifier = Modifier.align(CenterHorizontally), text = "Project Name")
                    Text(modifier = Modifier.align(CenterHorizontally), text = "1999$")
                    Text(modifier = Modifier.align(CenterHorizontally), text = "Briefly descripted")
                }
            }
        }
        Column(Modifier.fillMaxSize()) {
            Row(modifier = Modifier.height(30.dp)) {
                // Дополнительный контент, если необходимо
            }

            Box(modifier = Modifier
                .background(Color.Black)
                .height(3.dp)
                .fillMaxWidth()
                .padding(bottom = 10.dp)
            )

            New_post()
        }
    }
}