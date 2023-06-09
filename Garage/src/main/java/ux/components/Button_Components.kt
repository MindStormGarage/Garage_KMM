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
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.cartel.garage.SPUsage
import com.cartel.garage.SharedPreferencesManagerImpl
import com.cartel.garage.functionality.Get_Post_Querry
import kotlinx.coroutines.launch

@Composable
fun Authorize(
    login: MutableState<String>,
    password: MutableState<String>,
    resp:MutableState<String>,
    navController: NavHostController,
    spUsage: SPUsage
) {
    val scope = rememberCoroutineScope()
    val signUp: () -> Unit = {
        scope.launch {
             Get_Post_Querry().sign_up(login.value, password.value,"softymodel@gmail.com") { serverResponse ->
                 if (serverResponse.toInt()==200){
                     spUsage.set_login(login.value)
                     spUsage.set_password(password.value)
                     navController.navigate("head")
                 }
            }
        }
    }
    val signIn: () -> Unit = {
        /* Todo: Implement the sign-up functionality */
    }

    Column {
        Button(onClick = signIn) {
            Text(text = "Sign-in")
        }
        Button(onClick = signUp) {
            Text(text = "Sign-up")
        }
    }
}




@Composable
fun New_post(navController: NavHostController) {
    Column(Modifier.fillMaxSize()){
        Button(modifier = Modifier
            .background(Color.Black)
            .padding(20.dp)
            .fillMaxSize(), onClick = { navController.navigate("newpost") }) {Text(text="Ready to publish your idea?!?",color=Color.White)}
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
fun menu_func(navController: NavHostController) {
    val ancient_themki={
        navController.navigate("stock")
    }
    val profile={
        navController.navigate("profile")
    }
    val likes={
        navController.navigate("match")
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
