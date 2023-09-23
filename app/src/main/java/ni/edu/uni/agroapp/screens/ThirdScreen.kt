package ni.edu.uni.agroapp.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ni.edu.uni.agroapp.components.CardOptions
import ni.edu.uni.agroapp.components.TextFieldNormal
import ni.edu.uni.agroapp.R
import ni.edu.uni.agroapp.components.LoginButton
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
                        name = "Pedro Pablo",
                        localitation = "a 8 km")
                    RowActions(
                        name = "Andrew Tico",
                        localitation = " a 7km")
                RowActions(
                    name = "Juan Perez",
                    localitation = " a 4km")
                RowActions(
                    name = "Ana Lopez",
                    localitation = " a 8km")
                RowActions(
                    name = "Luis Lima",
                    localitation = " a 7km")
                RowActions(
                    name = "Enoc Garcia",
                    localitation = " a 7km")

            }
        }
    }
}
@Preview(showSystemUi = true)
@Composable
fun ThirdScreenPreview(){
    ThirdScreen()
}