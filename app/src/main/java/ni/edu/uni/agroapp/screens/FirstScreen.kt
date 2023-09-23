package ni.edu.uni.agroapp.screens

import android.R
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
import ni.edu.uni.agroapp.components.TextFieldNormal
import ni.edu.uni.agroapp.components.dropDownMenu

@Composable
fun FirstScreen(){
  Column (
      modifier = Modifier
          .fillMaxSize()
          .padding(30.dp),
    horizontalAlignment = Alignment.CenterHorizontally
  ) {Text(
        text = "Busquemos acerca de tu cultivo",
        fontSize = 28.sp,
        fontWeight = FontWeight.ExtraBold,
        color = Color(0xFF737373),
        textAlign = TextAlign.Center

    )
      TextFieldNormal(text = "Nombre de la finca" ,
          onValueChange = {})
      dropDownMenu( )
}
  }
@Composable
fun MyTextBox(){

}
@Preview(showSystemUi = true)
@Composable
fun FirstScreenPreview(){
    FirstScreen()
}
