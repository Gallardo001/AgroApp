package ni.edu.uni.agroapp.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ni.edu.uni.agroapp.R

@Composable
fun RowActions (name:String, localitation:String){
    Row (horizontalArrangement = Arrangement.spacedBy(10.dp),
        verticalAlignment = Alignment.CenterVertically) {
        Icon(
            painter = painterResource(id = R.drawable.perfil),
            contentDescription = "usuario")
        Text(text = name,
            fontSize = 14.sp ,
            textAlign = TextAlign.Center);
        Text(text = localitation,
            fontSize = 14.sp ,
            textAlign = TextAlign.Center)
        LoginButton(
            loginEnable = true,
            text = "Perfil") {

        }

    }
}