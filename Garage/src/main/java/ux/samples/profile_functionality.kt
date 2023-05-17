package ux.samples

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Logout
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import ux.components.icons

@Composable
fun topbar(navController: NavHostController) {
    Row(modifier = Modifier
        .fillMaxWidth()
        .height(20.dp)
        .background(Color.Black), verticalAlignment = Alignment.CenterVertically){
        icons(icn = Icons.Filled.ArrowBack, onClick = { navController.navigate("head") }, Modifier.background(Color.Black))
        Text(text = "Soft Model", Modifier.weight(1f), color=Color.White, textAlign = TextAlign.Center)
        icons(icn = Icons.Filled.Logout, onClick = { navController.navigate("auth") }, Modifier.background(Color.Black))
    }
}
@Composable
fun avatar(){
Column(Modifier.fillMaxWidth().height(200.dp)) {
    Box(
        modifier = Modifier
            .align(Alignment.CenterHorizontally)
            .size(200.dp) // Adjust the size according to your avatar
            .clip(CircleShape)
            .background(Color.White)
            .border(
                shape = CircleShape,
                border = BorderStroke(2.dp, Color.Black)
            )
    ) {
        //content
    }
}}
@Preview
@Composable
fun Bio(){
    Column() {
        val Fields= listOf("Качество","Скорость","Дружелюбность","Часовой пояс")
        for (field in Fields) {
            Text(text = field, color = Color.White)
        }
    }
}