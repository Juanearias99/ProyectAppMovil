package com.example.proyectofinalapps

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.proyectofinalapps.ui.theme.AlertasAppTheme
import com.example.proyectofinalapps.ui.theme.navigation.Navigation
import com.example.proyectofinalapps.ui.theme.screen.HomeUser
import com.example.proyectofinalapps.ui.theme.screens.DetailsReportScreeen
import com.example.proyectofinalapps.ui.theme.screens.EmailForgotPasswordScreen
import com.example.proyectofinalapps.ui.theme.screens.LoginScreen
import com.example.proyectofinalapps.ui.theme.screens.NewReportScreen
import com.example.proyectofinalapps.ui.theme.screens.SelectFileScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?)  {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AlertasAppTheme {

                //Navigation()

                //DetailsReportScreeen()
                //RegisterScreen()
                //ForgotPasswordScreen()
                //EmailForgotPasswordScreen()
                //NewReportScreen()
                //ResetPassword()
                //ConfarmationCode()
                //VerificationDelete()
                //MenuNotifications()
                //Profile()
                //Comentarios()
                //Historial()
                //PendientesVerificacion()
                //Rechazo()
                //Reportes()
                //Notification()
                HomeUser(navigateToProfile = {}, navigateToNotification = {}, navigateToNewReport = {},
                    navigateToDetailsReport = {})

                //HomeAdmin()
            }
        }
    }
}
