package ni.edu.uni.agroapp.screens

import android.R
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
import androidx.navigation.NavController
import ni.edu.uni.agroapp.components.LoginButton
import ni.edu.uni.agroapp.components.TextFieldNormal
import ni.edu.uni.agroapp.components.dropDownMenu
import ni.edu.uni.agroapp.navigation.Screens

@Composable
fun FirstScreen(modifier: Modifier = Modifier, navController: NavController){
  Column (
      modifier = modifier
          .fillMaxSize()
          .padding(30.dp),
    horizontalAlignment = Alignment.CenterHorizontally,
      verticalArrangement = Arrangement.spacedBy(30.dp)
  ) {Text(
        text = "Busquemos acerca de tu cultivo",
        fontSize = 40.sp,
        fontWeight = FontWeight.ExtraBold,
        color = Color(0xFF737373),
        textAlign = TextAlign.Center

    )
      TextFieldNormal(text = "Nombre de la finca" ,
          onValueChange = {})
      dropDownMenu(
          list = listOf("Cacao", "Maíz", "Frijol", "Arroz", "Café"),
          title = "Tipos de cultivos"
      )
      dropDownMenu(
          list = listOf("Atlántico Norte", "Atlántico Sur", "Boaco", "Carazo",
              "Chinandega", "Chontales", "Esteli", "Granada", "Jinotega", "León",
              "Madriz", "Managua", "Masaya", "Matagalpa", "Nueva Segovia",
              "Río San Juan", "Rivas"),
          title = "Locolazacion"
      )
      LoginButton(
          loginEnable = true,
          text = "Buscar") {
           navController.navigate(Screens.S.route)
      }
}
  }

