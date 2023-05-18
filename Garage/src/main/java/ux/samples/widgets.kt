package ux.samples

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import ux.components.Separator
import ux.components.Textfield_Def

@Composable
fun PostRead(navController: NavHostController) {
    topbar(navController = navController)
    Separator()
    Column(Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center) {
        Row(Modifier.fillMaxWidth()) {
         Text(text = "Project Name", textAlign = TextAlign.Center, modifier = Modifier.fillMaxWidth())
        }
        Row(Modifier.fillMaxWidth()) {
            Text(text = "Price", textAlign = TextAlign.Center, modifier = Modifier.fillMaxWidth())
        }
        Row(Modifier.fillMaxWidth()) {
            Text(text = "Description", textAlign = TextAlign.Center, modifier = Modifier.fillMaxWidth())
        }
        Button(onClick = { /*TODO*/ }, Modifier.align(CenterHorizontally)) {
            Text(text = "OK", textAlign = TextAlign.Center)
        }
    }
}

@Composable
fun PostCreation(navController: NavHostController) {
    topbar(navController =navController )
    val logo= remember {
        mutableStateOf("")
    }
    val price= remember {
        mutableStateOf("")
    }
    val description= remember {
        mutableStateOf("")
    }
    Separator()
    Column(Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center) {
        Row(Modifier.fillMaxWidth(),Arrangement.Center) {
        Textfield_Def(Primary_Text = logo , tex ="Название проекта")
             }
        Row(Modifier.fillMaxWidth(), Arrangement.Center) {
            Textfield_Def(Primary_Text = price , tex ="Цена")
             }
        Row(Modifier.fillMaxWidth(),  Arrangement.Center) {
            Textfield_Def(Primary_Text = description , tex ="Описание")
        }
        Button(onClick = { /*TODO*/ }, Modifier.align(CenterHorizontally)) {
            Text(text = "OK", textAlign = TextAlign.Center)
        }
    }
}