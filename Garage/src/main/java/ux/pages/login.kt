package ux.pages

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import ux.components.Authorize
import ux.components.Pass
import ux.components.Separator
import ux.components.field_input
import ux.components.surface_label

@Composable
fun auth_screen(navController: NavHostController) {
    val login= remember{
        mutableStateOf("")}
    val password= remember {
        mutableStateOf("")
    }
    val Txt= remember {
        mutableStateOf("Welcome to Garage!")
    }


    Column(
        Modifier
            .fillMaxSize()
            .background(Color.LightGray)) {
        surface_label(padding = Modifier
            .padding(8.dp)
            .align(Alignment.CenterHorizontally), txt =Txt.value)
        Column(Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
            field_input(login,"Login","example@mail.uk")
            Pass(password)
            Authorize(login = login, password = password , Edit =Txt, navController)
        }
        }
}

