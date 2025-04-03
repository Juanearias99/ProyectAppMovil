package com.example.proyectofinalapps.ui.theme.navigation

import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.proyectofinalapps.ui.theme.screen.Comentarios
import com.example.proyectofinalapps.ui.theme.screen.ConfarmationCode
import com.example.proyectofinalapps.ui.theme.screen.Historial
import com.example.proyectofinalapps.ui.theme.screen.HomeAdmin
import com.example.proyectofinalapps.ui.theme.screen.HomeUser
import com.example.proyectofinalapps.ui.theme.screen.MenuNotifications
import com.example.proyectofinalapps.ui.theme.screen.Notification
import com.example.proyectofinalapps.ui.theme.screen.PendientesVerificacion
import com.example.proyectofinalapps.ui.theme.screen.Profile
import com.example.proyectofinalapps.ui.theme.screen.Rechazo
import com.example.proyectofinalapps.ui.theme.screen.Reportes
import com.example.proyectofinalapps.ui.theme.screen.ResetPassword
import com.example.proyectofinalapps.ui.theme.screen.VerificationDelete
import com.example.proyectofinalapps.ui.theme.screens.DetailsReportScreeen
import com.example.proyectofinalapps.ui.theme.screens.EmailForgotPasswordScreen
import com.example.proyectofinalapps.ui.theme.screens.LoginScreen
import com.example.proyectofinalapps.ui.theme.screens.NewReportScreen
import com.example.proyectofinalapps.ui.theme.screens.RegisterScreen

@Composable
fun Navigation() {

    val navController = rememberNavController()

    Surface {

        NavHost(
            navController = navController,
            startDestination = RouteScreen.Login
        ) {

            composable<RouteScreen.Login> {
                LoginScreen(
                    navigateToRegister = { navController.navigate(RouteScreen.Register) },
                    navigateToForgotPasswordScreen = { navController.navigate(RouteScreen.ForgotPassword) },
                    navigateToHomeUser = { navController.navigate(RouteScreen.HomeUser) },
                )
            }

            composable<RouteScreen.Register> {
                RegisterScreen()
            }

            composable<RouteScreen.Reportes> {
                NewReportScreen()
            }

            composable<RouteScreen.ForgotPassword> {
                EmailForgotPasswordScreen(
                )

            }

            composable<RouteScreen.DetailReports> {
                DetailsReportScreeen()

            }

            composable<RouteScreen.Comentarios> {
                Comentarios()

            }

            composable<RouteScreen.ConfirmationCode> {
                ConfarmationCode()

            }

            composable<RouteScreen.Historial> {
                Historial()

            }

            composable<RouteScreen.HomeAdmin> {
                HomeAdmin()
            }

            composable<RouteScreen.HomeUser> {
                HomeUser(
                    navigateToProfile = { navController.navigate(RouteScreen.Profile) },
                    navigateToNotification = { navController.navigate(RouteScreen.Notification) },
                    navigateToNewReport = { navController.navigate(RouteScreen.NewReport) },
                    navigateToDetailsReport = { navController.navigate(RouteScreen.DetailReports) },




                )
            }

            composable<RouteScreen.MenuNotifications> {
                MenuNotifications()
            }

            composable<RouteScreen.Notification> {
                Notification()
            }

            composable<RouteScreen.PendientesVerificacion> {
                PendientesVerificacion()
            }

            composable<RouteScreen.Profile> {
                Profile()
            }

            composable<RouteScreen.Rechazo> {
                Rechazo()
            }

            composable<RouteScreen.Reportes> {
                Reportes()
            }

            composable<RouteScreen.ResetPassword> {
                ResetPassword()
            }

            composable<RouteScreen.VerificationDelete> {
                VerificationDelete()
            }
        }
    }
}