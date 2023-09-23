package ni.edu.uni.agroapp.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ni.edu.uni.agroapp.R

@Composable
fun RowActions (name:String, localitation:String, user:String, icon:Boolean){
    Row (modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(10.dp),
        verticalAlignment = Alignment.CenterVertically) {
        if (icon){Icon(
            painter = painterResource(id = R.drawable.perfil),
            contentDescription = "usuario",
            modifier = Modifier.weight(1.0f))}
        Text(text = name,
            fontSize = 14.sp ,
            textAlign = TextAlign.Center,
            modifier = Modifier.weight(1.0f));
        Text(text = localitation,
            fontSize = 14.sp ,
            textAlign = TextAlign.Center,
            modifier = Modifier.weight(1.0f))

        LoginButton(
            loginEnable = true,
            text = user,
            modifier = Modifier.weight(1f)
        ) {

        }

    }
}