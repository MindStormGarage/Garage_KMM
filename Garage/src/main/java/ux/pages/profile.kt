package ux.pages

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ux.components.field_input
@Preview(showBackground = true)
@Composable
fun profile_page(){
    val value_preference= remember {
        mutableStateOf("")
    }
    Column(Modifier.fillMaxSize()) {
        Row(modifier=Modifier.fillMaxWidth()) {
            Text(text="Profile name", textAlign = TextAlign.Center)
            Text(text = "Log out", textAlign = TextAlign.End)
        }
        Text(text = "BIO")
        for (i in 0..5){
            Text(text = "О себе:.....")}
    }
    Box(modifier = Modifier
        .background(Color.Black)
        .height(22.dp)
        .fillMaxSize())
    Text(text = "Preferencies: ")
    Row(Modifier.fillMaxWidth()) {
        Text("Введите свои предпочтения:")
        field_input(Primary_Text = value_preference,"","С++, Kotlin, Frontend, Fintech")
    }
    Box(modifier = Modifier
        .background(Color.Black)
        .height(22.dp)
        .fillMaxSize())
    Text(text = "Your Project")
    Text(text="Bluetooth Messanger")
    Row() {
        
    }
}