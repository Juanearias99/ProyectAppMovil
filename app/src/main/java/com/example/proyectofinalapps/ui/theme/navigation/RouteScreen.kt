package com.example.proyectofinalapps.ui.theme.navigation

import kotlinx.serialization.Serializable

sealed class  RouteScreen {

    @Serializable
    data object Login : RouteScreen()

    @Serializable
    data object Register : RouteScreen()

    @Serializable
    data object NewReport : RouteScreen()

    @Serializable
    data object ForgotPassword : RouteScreen()

    @Serializable
    data object DetailReports : RouteScreen()

    @Serializable
    data object Comentarios : RouteScreen()

    @Serializable
    data object ConfirmationCode : RouteScreen()

    @Serializable
    data object Historial : RouteScreen()

    @Serializable
    data object HomeAdmin : RouteScreen()

    @Serializable
    data object HomeUser : RouteScreen()

    @Serializable
    data object MenuNotifications : RouteScreen()

    @Serializable
    data object Notification : RouteScreen()

    @Serializable
    data object  PendientesVerificacion: RouteScreen()

    @Serializable
    data object Profile : RouteScreen()

    @Serializable
    data object Rechazo : RouteScreen()

    @Serializable
    data object Reportes : RouteScreen()

    @Serializable
    data object ResetPassword : RouteScreen()

    @Serializable
    data object VerificationDelete : RouteScreen()

}