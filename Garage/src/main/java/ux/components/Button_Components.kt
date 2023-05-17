package ux.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import java.util.Dictionary

@Composable
fun Authorize(login: MutableState<String>, password: MutableState<String>, Edit:MutableState<String>){
    val sing_in={
        /*Todo*/
    }
    val sing_up={
        /*Todo*/
    }
    TextButton(onClick = sing_in) {
        Text(text = "Sing-in")
    }
    TextButton(onClick =sing_up) {
        Text(text = "Sing-up")
    }
}

@Composable
fun New_post(){
    Column(Modifier.fillMaxSize()){
        Button(modifier = Modifier
            .background(Color.Unspecified)
            .padding(20.dp)
            .fillMaxSize(), onClick = { /*TODO*/ }) {Text(text="Ready to publish your idea?!?")}
}

    }

@Composable
fun icons(icn: ImageVector, onClick: () -> Unit, modifier: Modifier = Modifier) {
    IconButton(
        modifier = modifier.size(40.dp),
        onClick = onClick
    ) {
        Icon(
            icn,
            "contentDescription",
            tint = Color.Gray
        )
    }
}

@Composable
fun menu_func(){
    val ancient_themki={
        /*Todo*/
    }
    val profile={
        /*Todo*/
    }
    val likes={
        /*Todo*/
    }

    val SM={
        /*TODO*/
    }
    val all_functionality_of_menu= mapOf(
        "Profile" to profile,
        "Match" to likes,
        "Stock" to ancient_themki,
        "Github" to SM
    )

Column(Modifier.fillMaxSize()) {
        for (element in all_functionality_of_menu){
            BoxWithConstraints() {
                Row(modifier = Modifier
                    .fillMaxWidth()
                    .height((maxHeight/3)),Arrangement.End){
                    TextButton(onClick = element.value) {
                        Text(text = element.key, textAlign = TextAlign.Center)
                    } }
            }
        }

        Box(modifier = Modifier
            .fillMaxWidth()
            .height(4.dp))



}
}