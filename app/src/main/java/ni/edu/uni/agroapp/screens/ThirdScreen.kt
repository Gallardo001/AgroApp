package ni.edu.uni.agroapp.screens

import androidx.compose.foundation.layout.*
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
import ni.edu.uni.agroapp.components.CardOptions
import ni.edu.uni.agroapp.components.RowActions

@Composable
fun ThirdScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(30.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(30.dp)
    ) {
        Text(
            text = "Asesoria en Linea",
            fontSize = 40.sp,
            fontWeight = FontWeight.ExtraBold,
            color = Color(0xFF737373),
            textAlign = TextAlign.Center

        )
        CardOptions {
            Column{
                Text(
                        text = "Pérfiles segun Ubicacion Proxima",
                        fontSize = 21.8.sp,
                        fontWeight = FontWeight.ExtraBold,
                        color = Color(0xFF737373),
                        textAlign = TextAlign.Center,
                )
                    RowActions(
                        icon = true,
                        name = "Pedro Pablo",
                        localitation = "a 8 km",
                        user = "Perfil")
                    RowActions(
                        icon = true,
                        name = "Andrew Tico",
                        localitation = " a 7km",
                        user = "Perfil")
                RowActions(
                    icon = true,
                    name = "Juan Perez",
                    localitation = " a 4km",
                    user = "Perfil")
                RowActions(
                    icon = true,
                    name = "Ana Lopez",
                    localitation = " a 8km",
                    user = "Perfil")
                RowActions(
                    icon = true,
                    name = "Luis Lima",
                    localitation = " a 7km",
                    user = "Perfil")
                RowActions(
                    icon = true,
                    name = "Enoc Garcia",
                    localitation = " a 7km",
                    user = "Perfil")

            }
        }
    }
}
@Preview(showSystemUi = true)
@Composable
fun ThirdScreenPreview(){
    ThirdScreen()
}