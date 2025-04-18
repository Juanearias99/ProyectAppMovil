package com.example.proyectofinalapps.ui.theme.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.LocationOn
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun componente_historial(
    nombre: String,
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(5.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            imageVector = Icons.Outlined.LocationOn,
            contentDescription = "Evento",
            modifier = Modifier
                .size(69.dp)
                .padding(end = 8.dp)
        )

        // Cuadro de información en lugar de TextField
        Box(
            modifier = Modifier
                .weight(1f)
                .clip(RoundedCornerShape(4.dp)) // Bordes redondeados
                .border(1.dp, Color.Gray, RoundedCornerShape(4.dp)) // Borde
                .background(MaterialTheme.colorScheme.surface) // Fondo
                .padding(16.dp), // Espaciado interno
            contentAlignment = Alignment.CenterStart
        ) {
            Text(
                text = nombre,
                style = MaterialTheme.typography.bodyMedium
            )
        }
    }
}