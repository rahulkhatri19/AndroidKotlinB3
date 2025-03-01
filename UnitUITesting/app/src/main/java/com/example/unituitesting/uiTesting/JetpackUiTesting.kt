package com.example.unituitesting.uiTesting

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun JetpackUiTesting(){
    var inputEmail by remember { mutableStateOf(TextFieldValue("")) }
    var inputPassword by remember { mutableStateOf(TextFieldValue("")) }
    var buttonClicked by remember { mutableStateOf(false) }

    Column(modifier = Modifier.padding(16.dp)) {
        Spacer(Modifier.height(108.dp))
        OutlinedTextField(
            value = inputEmail,
            onValueChange = {
                inputEmail = it
            },
            textStyle = TextStyle.Default.copy(fontSize = 16.sp),
            label = {
                Text(
                    text = "EMAIL", fontSize = 16.sp
                )
            },
            placeholder = {
                Text(
                    text = "EMAIL", fontSize = 16.sp
                )
            },
            modifier = Modifier
                .padding(top = 12.dp)
                .fillMaxWidth(),
        )

        OutlinedTextField(
            value = inputPassword,
            onValueChange = {
                inputPassword = it
            },
            textStyle = TextStyle.Default.copy(fontSize = 16.sp),
            label = {
                Text(
                    text = "Password", fontSize = 16.sp
                )
            },
            placeholder = {
                Text(
                    text = "Password", fontSize = 16.sp
                )
            },
            modifier = Modifier
                .padding(top = 12.dp)
                .fillMaxWidth(),
        )

        Button(
            onClick = {
                buttonClicked = true
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 12.dp)
        ) {
            Text(
                text = "Login"
            )
        }

        Spacer(Modifier.height(12.dp))

        if (buttonClicked) {
            Text("Button Clicked!")
        }
    }
}