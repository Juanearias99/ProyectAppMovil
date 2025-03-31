package com.example.proyectofinalapps.ui.theme.navigation

import kotlinx.serialization.Serializable

sealed class  RouteScreen {

    @Serializable
    data object Home : RouteScreen()

    @Serializable
    data object Login : RouteScreen()

    @Serializable
    data object Register : RouteScreen()

    @Serializable
    data object Report : RouteScreen()

    @Serializable
    data object ForgotPassword : RouteScreen()

    @Serializable
    data object DetailReports : RouteScreen()



}