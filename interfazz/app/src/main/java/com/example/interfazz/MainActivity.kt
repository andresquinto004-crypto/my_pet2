package com.example.interfazz

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import com.example.interfazz.ui.NavegacionApp
import com.example.interfazz.ui.theme.MascotaAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MascotaAppTheme {
                Surface(color = MaterialTheme.colorScheme.background) {
                    NavegacionApp()
                }
            }
        }
    }
}




