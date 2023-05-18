package ux.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun field_input(Primary_Text: MutableState<String>, Title:String="", Hint:String="", KeyType:KeyboardType= KeyboardType.Text){

    TextField(value = Primary_Text.value,modifier=Modifier.fillMaxWidth(), keyboardOptions = KeyboardOptions(keyboardType =KeyType ), label = { Text(text = Title)}, placeholder = { Text(text = Hint)}, onValueChange ={ input->Primary_Text.value=input} )
}

@Composable
fun surface_label(padding:Modifier,txt:String) {
    Surface(
        modifier = padding,
        border = BorderStroke(2.dp, Color.Red),
        contentColor = Color.Blue,
        elevation = 8.dp,
        shape = CircleShape
    ) {
        Text(txt, modifier = padding)
    }
}
@Composable
fun Search(Primary_Text: MutableState<String>, mod:Modifier){
    TextField(value = Primary_Text.value, modifier = mod, label = { Text(text = "Search", textAlign = TextAlign.Center)}, onValueChange ={ input->Primary_Text.value=input} )
}

@Composable
fun Pass(password: MutableState<String>) {
    var passwordVisible by rememberSaveable { mutableStateOf(false) }

    TextField(
        modifier=Modifier.fillMaxWidth(),
        value = password.value,
        onValueChange = { inp-> password.value= inp },
        label = { Text("Password") },
        singleLine = true,
        placeholder = { Text("Password") },
        visualTransformation = if (passwordVisible) VisualTransformation.None else PasswordVisualTransformation(),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
        trailingIcon = {
            val image = if (passwordVisible)
                Icons.Filled.Visibility
            else Icons.Filled.VisibilityOff

            // Please provide localized description for accessibility services
            val description = if (passwordVisible) "Hide password" else "Show password"

            IconButton(onClick = {passwordVisible = !passwordVisible}){
                Icon(imageVector  = image, description)
            }
        })
}
@Composable
fun Textfield_Def(Primary_Text: MutableState<String>,tex:String){
    TextField(value = Primary_Text.value, label = { Text(text = tex, textAlign = TextAlign.Center)}, onValueChange ={ input->Primary_Text.value=input} )
}