package ux.pages


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.navigation.NavHostController
import ux.components.Separator
import ux.samples.Bio
import ux.samples.avatar
import ux.samples.topbar

@Composable
fun profile_screen(navController: NavHostController) {
    Column(Modifier.fillMaxSize()) {
        topbar(navController)
        avatar()
        Separator()
        Text(text = "Statistics", textAlign = TextAlign.Center,color=Color.White, modifier = Modifier.fillMaxWidth())
        Separator()
        Bio()
        Separator()
        Text(text = "Project", textAlign = TextAlign.Center,color=Color.White, modifier = Modifier.fillMaxWidth())
        Box(modifier = Modifier.fillMaxSize().background(Color.White))
    }

}