package ux.pages

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ux.components.Authorize
import ux.components.Pass
import ux.components.field_input
import ux.components.surface_label

@Preview(showBackground = true)
@Composable
fun Auth_func(){
    Column(
        Modifier
            .fillMaxSize()
            .background(Color.Yellow)) {
        val login= remember{
            mutableStateOf("")}
        val password= remember {
            mutableStateOf("")
        }
        val Txt= remember {
            mutableStateOf("Welcome to Garage!")
        }
        surface_label(padding = Modifier
            .padding(8.dp)
            .align(Alignment.CenterHorizontally), txt =Txt.value)
        Row(
            Modifier
                .fillMaxWidth()
                .height(30.dp)) {}
        field_input(login,"Login","example@mail.uk")
        Row(
            Modifier
                .fillMaxWidth()
                .height(30.dp)) {}
        Pass(password)
        Authorize(login = login, password = password , Edit =Txt )

    }
}