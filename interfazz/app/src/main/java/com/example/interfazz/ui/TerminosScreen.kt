package com.example.interfazz.ui

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun TerminosScreen(navController: NavController) {
    var aceptado by remember { mutableStateOf(false) }

    Scaffold(
        containerColor = Color.Black
    ) { padding ->
        Column(
            modifier = Modifier
                .padding(padding)
                .verticalScroll(rememberScrollState())
                .padding(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Términos y condiciones",
                color = Color.White,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(vertical = 16.dp)
            )

            Text(
                text = "Al usar My Pet aceptas los términos del servicio, la responsabilidad del cuidado animal y las condiciones de privacidad descritas aquí...",
                color = Color.White,
                fontSize = 14.sp
            )

            Spacer(modifier = Modifier.height(20.dp))

            Row(verticalAlignment = Alignment.CenterVertically) {
                Checkbox(
                    checked = aceptado,
                    onCheckedChange = { aceptado = it },
                    colors = CheckboxDefaults.colors(checkedColor = Color(0xFF4DD0E1))
                )
                Text("Acepto los términos", color = Color.White)
            }

            Spacer(modifier = Modifier.height(20.dp))

            Button(
                onClick = { if (aceptado) navController.navigate("mascota") },
                enabled = aceptado,
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF4DD0E1)),
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Aceptar", color = Color.Black)
            }
        }
    }
}
