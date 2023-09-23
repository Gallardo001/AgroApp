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
import ni.edu.uni.agroapp.components.CardOptions
import ni.edu.uni.agroapp.components.RowActions


@Composable
fun QuarterScreen(){
    Column(
        modifier = Modifier.fillMaxSize().padding(30.dp),
    horizontalAlignment = Alignment.CenterHorizontally,
    verticalArrangement = Arrangement.spacedBy(30.dp)
    ) {
        Text(
            text = "Productos Recomendados",
            fontSize = 40.sp,
            fontWeight = FontWeight.ExtraBold,
            color = Color(0xFF737373),
            textAlign = TextAlign.Center

        )
        CardOptions {
            Column{
                Text(
                    text = "Producto de compra en linea",
                    fontSize = 21.8.sp,
                    fontWeight = FontWeight.ExtraBold,
                    color = Color(0xFF737373),
                    textAlign = TextAlign.Center,
                )
                RowActions(
                    icon = false,
                    name = "Fertilizante",
                    localitation = "precio",
                    user = "compra")
                RowActions(
                    icon = false,
                    name = "Semillas",
                    localitation = " precio",
                    user = "compra")
                RowActions(
                    icon = false,
                    name = "Herramientas",
                    localitation = " precio",
                    user = "compra")
                RowActions(
                    icon = false,
                    name = "Maquinaria",
                    localitation = "precio",
                    user = "compra")
                RowActions(
                    icon = false,
                    name = "Fertilizante",
                    localitation = "precio",
                    user = "compra")
                RowActions(
                    icon = false,
                    name = "semillas",
                    localitation = "precio",
                    user = "compra")

            }
        }
    }
}
@Preview(showSystemUi = true)
@Composable
fun QuarterScreenPreview(){
    QuarterScreen()
}

