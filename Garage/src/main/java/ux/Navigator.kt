package ux

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import ux.pages.auth_screen
import ux.pages.head_screen
import ux.pages.match_screen
import ux.pages.profile_screen
import ux.pages.stock_screen

@Composable
fun AppNavigation(navController: NavHostController) {
    val navController = rememberNavController()
    NavHost(navController, startDestination = "auth") {
        composable("auth") { auth_screen(navController) }
        composable("head") { head_screen(navController) }
        composable("match") { match_screen(navController) }
        composable("profile"){ profile_screen(navController) }
        composable("stock") { stock_screen(navController) }
    }
}

