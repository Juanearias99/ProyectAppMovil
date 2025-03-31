package com.example.proyectofinalapps

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.proyectofinalapps.ui.theme.AlertasAppTheme
import com.example.proyectofinalapps.ui.theme.navigation.Navigation
import com.example.proyectofinalapps.ui.theme.screens.DetailsReportScreeen
import com.example.proyectofinalapps.ui.theme.screens.EmailForgotPasswordScreen
import com.example.proyectofinalapps.ui.theme.screens.NewReportScreen
import com.example.proyectofinalapps.ui.theme.screens.SelectFileScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?)  {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AlertasAppTheme {
          SelectFileScreen()

            // DetailsReportScreeen()

            // EmailForgotPasswordScreen()
            //NewReportScreen()
                //Navigation()
            }
        }
    }
}
