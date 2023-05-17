package ux.pages

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import ux.samples.WhiteRectangleWithButton
import ux.samples.topbar

@Composable
fun match_screen(navController: NavHostController) {
    Column(
        Modifier
            .background(Color.Gray)
            .fillMaxSize()) {
        topbar(navController)
        WhiteRectangleWithButton()
    }


}

