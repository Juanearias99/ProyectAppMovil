package com.example.proyectofinalapps.ui.theme.navigation

import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.Navigation
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
                    navigateToForgotPasswordScreen = { navController.navigate(RouteScreen.ForgotPassword) }
                )
            }

            composable<RouteScreen.Register> {
                RegisterScreen()
            }

            composable<RouteScreen.Report> {
                NewReportScreen()
            }

            composable<RouteScreen.ForgotPassword> {
                EmailForgotPasswordScreen(
                )

            }

            composable<RouteScreen.DetailReports> {
                DetailsReportScreeen()

            }
        }
    }
}
