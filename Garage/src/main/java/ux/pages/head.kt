package ux.pages

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ux.components.New_post
import ux.components.icons

@SuppressLint("SuspiciousIndentation")
@Preview(showBackground = true)
@Composable
fun head(){
    val menu_check=remember {
        mutableStateOf(false)
    }
    val search_check=remember {
        mutableStateOf(false)
    }
    Column(
        Modifier
            .background(Color.DarkGray)
            .fillMaxSize()){
        Row(
            Modifier
                .height(50.dp)
                .fillMaxSize()
                .background(Color.Cyan)){
            icons(icn = Icons.Filled.Menu,menu_check)
            Column(horizontalAlignment = CenterHorizontally) {
                Text(text = "Garage", color = Color.Black, modifier = Modifier
                    .padding(top = 5.dp)
                    .align(CenterHorizontally))
                Text("Open Mind Platform", color = Color.Black, modifier = Modifier
                    .padding(top = 5.dp)
                    .align(CenterHorizontally))
            }
            icons(icn = Icons.Filled.Search,search_check)
            }

        Box(modifier = Modifier
            .background(Color.Black)
            .height(3.dp)
            .fillMaxSize()
            .padding(bottom = 10.dp))
        Row(modifier = Modifier.height(30.dp)) {
            
        }
        for (i in 0..5)
        Card(backgroundColor = Color.White, modifier = Modifier
            .padding(10.dp)
            .height(80.dp)
            .fillMaxSize()) {
            Column(Modifier.fillMaxSize()) {
                Text(modifier = Modifier.align(CenterHorizontally), text = "Project Name")
                Text(modifier = Modifier.align(CenterHorizontally), text = "1999$")
                Text(modifier = Modifier.align(CenterHorizontally), text = "Briefly descripted")
            }
        }
        Column(Modifier.fillMaxSize()){
        Row(modifier = Modifier.height(30.dp)) {

        }
        Box(modifier = Modifier
            .background(Color.Black)
            .height(3.dp)
            .fillMaxSize()
            .padding(bottom = 10.dp))

        New_post()}}
}