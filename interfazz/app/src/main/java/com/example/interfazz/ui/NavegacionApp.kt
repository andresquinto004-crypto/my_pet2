package com.example.interfazz.ui

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun NavegacionApp() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "login") {
        composable("login") { LoginScreen(navController) }
        composable("crearCuenta") { CrearCuentaScreen(navController) }
        composable("terminos") { TerminosScreen(navController) }
        composable("mascota") { MascotaScreen() } // Tu pantalla original
    }
}
