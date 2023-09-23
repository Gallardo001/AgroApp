package ni.edu.uni.agroapp.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun FirstScreen(){
  Column (modifier = Modifier.fillMaxSize()) {

    Text(
        text = "Busquemos acerca de tu cultivo",
        fontSize = 18.sp,
        color = Color.Blue
    )
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
