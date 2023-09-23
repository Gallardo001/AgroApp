package ni.edu.uni.agroapp.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

sealed class Screens(
    val icon: ImageVector,
    val route:String
){
    object Login: Screens(
        Icons.Filled.Call,
        "pantalla1")
    object Register: Screens(
        Icons.Filled.Call,
        "pantalla2")

    object Home: Screens(
        Icons.Filled.Home,
        "pantalla3")
    object Betwen: Screens(
        Icons.Filled.Face,
        "pantalla4")
    object End: Screens(
        Icons.Filled.Settings,
        "pantalla5")

}