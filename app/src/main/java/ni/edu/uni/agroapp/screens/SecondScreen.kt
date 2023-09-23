package ni.edu.uni.agroapp.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ni.edu.uni.agroapp.components.LoginButton
import ni.edu.uni.agroapp.components.TextFieldNormal

@Composable
fun SecondScreen(){
    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(30.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(30.dp)
    ){
        Text(text = "Nombre del Cultivo",
            fontSize = 45.sp,
            fontWeight = FontWeight.ExtraBold,
            color = Color(0xFF737373),
            textAlign = TextAlign.Center)
        TextFieldNormal(
            text = "Epoca de Siembra",
            onValueChange = {} )
        TextFieldNormal(
            text = "Tipo de Cultivo",
            onValueChange = {} )
        TextFieldNormal(
            text = "Requerimientos",
            onValueChange = {} )
        TextFieldNormal(
            text = "Fertilizacion",
            onValueChange = {} )
        TextFieldNormal(
            text = "Plagas y Enfermedades",
            onValueChange = {} )
        LoginButton(
            loginEnable = true,
            text = "Almacenar Informacion") {
            
        }
    }
    
}

@Preview (showSystemUi = true)
@Composable
fun SecondScreenPreview(){
    SecondScreen()
}