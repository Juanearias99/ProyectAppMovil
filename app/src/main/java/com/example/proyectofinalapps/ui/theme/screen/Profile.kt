package com.example.proyectofinalapps.ui.theme.screen

import android.provider.ContactsContract.Profile
import android.util.Patterns
import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.PersonAdd
import androidx.compose.material.icons.rounded.Visibility
import androidx.compose.material.icons.rounded.VisibilityOff
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import com.example.proyectofinalapps.R

@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun Profile(){
    var name by remember { mutableStateOf("") }
    var lastName by remember { mutableStateOf("") }
    var city by remember { mutableStateOf("") }
    val cities = listOf("Armenia", "Pereira", "Manizales", "Medellin")
    var expandedCity by remember { mutableStateOf(false) }
    var address by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var errorEmail by remember { mutableStateOf(false) }
    var password by remember { mutableStateOf("") }
    var errorPassword by remember { mutableStateOf(false) }
    var visibilityPassword by remember { mutableStateOf(false) }
    val context = LocalContext.current

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(stringResource(R.string.Profile), style = MaterialTheme.typography.headlineMedium)

        OutlinedTextField(
            value = name,
            onValueChange = { name = it },
            label = { Text(stringResource(R.string.name_label)) },
            modifier = Modifier.fillMaxWidth(0.8f)
        )

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(
            value = lastName,
            onValueChange = { lastName = it },
            label = { Text(stringResource(R.string.lastname_label)) },
            modifier = Modifier.fillMaxWidth(0.8f)
        )
        Spacer(modifier = Modifier.height(16.dp))

        ExposedDropdownMenuBox(
            expanded = expandedCity,
            onExpandedChange = { expandedCity = !expandedCity },
            modifier = Modifier.fillMaxWidth(0.8f)
        ) {
            OutlinedTextField(
                modifier = Modifier.menuAnchor().fillMaxWidth(),
                value = city,
                onValueChange = {},
                readOnly = true,
                placeholder = { Text(stringResource(R.string.city_label)) },
                trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(expanded = expandedCity) }
            )
            ExposedDropdownMenu(expanded = expandedCity, onDismissRequest = { expandedCity = false }) {
                cities.forEach { item ->
                    DropdownMenuItem(
                        text = { Text(text = item) },
                        onClick = {
                            city = item
                            expandedCity = false
                        }
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(
            value = address,
            onValueChange = { address = it },
            label = { Text(stringResource(R.string.address_label)) },
            modifier = Modifier.fillMaxWidth(0.8f)
        )

        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(
            value = email,
            singleLine = true,
            isError = errorEmail,
            supportingText = {
                if (errorEmail) {
                    Text(stringResource(R.string.validation_email))
                }
            },
            modifier = Modifier.fillMaxWidth(0.8f),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
            label = { Text(stringResource(R.string.email_label)) },
            onValueChange = {
                email = it
                errorEmail = !Patterns.EMAIL_ADDRESS.matcher(email).matches()
            }
        )


        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = {
                if (email == "sophia.cuba14@gmail.com" && password == "1234") {
                    Toast.makeText(context, context.getString(R.string.toast_welcome), Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(context, context.getString(R.string.toast_error), Toast.LENGTH_SHORT).show()
                }
            },
            modifier = Modifier.fillMaxWidth(0.8f).height(48.dp),
            shape = RectangleShape,
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF1976D2))
        ) {
            Text(
                text = stringResource(R.string.ProfileUpdate),
                color = Color.White,
                modifier = Modifier.fillMaxWidth()
            )
        }

        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = {
                if (email == "sophia.cuba14@gmail.com" && password == "1234") {
                    Toast.makeText(context, context.getString(R.string.toast_welcome), Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(context, context.getString(R.string.toast_error), Toast.LENGTH_SHORT).show()
                }
            },
            modifier = Modifier.fillMaxWidth(0.8f).height(48.dp),
            shape = RectangleShape,
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF1976D2))
        ) {
            Text(
                text = stringResource(R.string.ProfileDelete),
                color = Color.White,
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}