package ux.pages

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController
import ux.components.New_post
import ux.components.Separator
import ux.samples.Menubar
import ux.samples.Vacancy
import ux.samples.headbar

@Composable
fun head_screen(navController: NavHostController) {
    val search_text= remember { mutableStateOf("") }
    val menuOpenState = remember { mutableStateOf(false) }
    val searchOpenState = remember { mutableStateOf(false) }
    val menuWidth = if (menuOpenState.value) 1f else 0f

    Column(
        Modifier.background(Color.Gray).fillMaxSize()) {
        headbar(search_text,searchOpenState,menuOpenState)
        if (menuOpenState.value) {
            Menubar(menuWidth,navController)
        }
        Separator()
        for (i in 0..5) {
           Vacancy()
        }
        Column(Modifier.fillMaxSize()) {
            Separator()
            New_post()
        }

}}