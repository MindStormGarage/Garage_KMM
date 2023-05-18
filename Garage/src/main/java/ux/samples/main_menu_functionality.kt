package ux.samples

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.times
import androidx.navigation.NavHostController
import ux.components.Search
import ux.components.icons
import ux.components.menu_func

@Composable
fun Vacancy(navController: NavHostController) {
    Card(
        backgroundColor = Color.Black, modifier = Modifier
            .padding(10.dp)
            .height(80.dp)
            .fillMaxWidth()
    ) {
        Column(Modifier.fillMaxSize().clickable { navController.navigate("readpost") }) {
            Text(modifier = Modifier.align(Alignment.CenterHorizontally), text = "Project Name")
            Text(modifier = Modifier.align(Alignment.CenterHorizontally), text = "1999$")
            Text(modifier = Modifier.align(Alignment.CenterHorizontally), text = "Briefly descripted")
        }
    }
}

@Composable
fun Search_Bar(searchOpenState: MutableState<Boolean>, search_text: MutableState<String>,mod:Modifier){
    if (searchOpenState.value==false){
        Column(mod)
        {
        Text(
            text = "Garage",
            color = Color.DarkGray,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )
        Text(
            "Open Mind Platform",
            color = Color.Black,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )
    }}
    else{
        Search(Primary_Text = search_text, mod)
    }
    icons(icn = Icons.Filled.Search, onClick = { searchOpenState.value = !searchOpenState.value })
}

@Composable
fun Menubar(menuWidth: Float, navController: NavHostController){
    Row(Modifier.fillMaxSize()) {


        Box(
            modifier = Modifier
                .background(Color.LightGray)
                .fillMaxHeight()
                .width((menuWidth * 100.dp))
        ) {
            menu_func(navController)
        }
        Box(modifier = Modifier
            .background(Color.DarkGray)
            .fillMaxSize()
        ){
            val tex="Garage!"
            Column(Modifier.fillMaxSize(),horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
                for (i in tex ){
                    Text(text = i.toString(), textAlign = TextAlign.End, color = Color.White)
                    Text(text = "")
                }

            }
        }
    }
}

@Composable
fun headbar(
    search_text: MutableState<String>,
    searchOpenState: MutableState<Boolean>,
    menuOpenState: MutableState<Boolean>
) {
    Row(
        Modifier
            .height(50.dp)
            .fillMaxWidth()
            .background(Color.LightGray),
        verticalAlignment = Alignment.CenterVertically
    ) {
        icons(icn = Icons.Filled.Menu, onClick = { menuOpenState.value = !menuOpenState.value })
        Search_Bar(searchOpenState = searchOpenState, search_text, Modifier.weight(1f))
    }
}
