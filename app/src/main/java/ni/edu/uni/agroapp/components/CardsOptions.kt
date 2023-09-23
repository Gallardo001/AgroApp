package ni.edu.uni.agroapp.components


import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun CardOptions(component: @Composable () -> Unit){
    Card(
        backgroundColor = Color(0xFFD9D9D9),
        shape = RoundedCornerShape(8.dp),
        elevation = 5.dp,
        content = { component()},
        modifier = Modifier.fillMaxWidth()
         )
}