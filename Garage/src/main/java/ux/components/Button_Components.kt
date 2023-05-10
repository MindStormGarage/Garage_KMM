package ux.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
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
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp

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
            .padding(20.dp)
            .fillMaxSize(), onClick = { /*TODO*/ }) {Text(text="Ready to publish your idea?")}
}

    }

@Composable
fun icons(icn:ImageVector, enabled:MutableState<Boolean>){
    val check_tools={
        enabled.value=!enabled.value
    }
    IconButton(
        modifier = Modifier.run { size(40.dp)},
        onClick = { }
    ) {
        Icon(
            icn,
            "contentDescription",
        )
    }
}