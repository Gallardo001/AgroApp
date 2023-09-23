package ni.edu.uni.agroapp.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.BottomAppBar
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import ni.edu.uni.agroapp.navigation.NavigationBottom
import ni.edu.uni.agroapp.navigation.NavigationHost
import ni.edu.uni.agroapp.navigation.Screens
import java.nio.file.WatchEvent

@Composable
fun HomeNav(navController: NavHostController) {

    val scaffoldState = rememberScaffoldState()


    val navItem = listOf(
        Screens.Home,
        Screens.Login,
        Screens.Register)

        Scaffold(
            scaffoldState = scaffoldState,
            bottomBar = { ButtomsNavigations(navController,navItem) }
        ){padding ->
           NavigationBottom(navController = navController,Modifier.padding(padding) )
        }
    }

@Composable
fun currentRoute(navController: NavHostController):String?{
    val entry by navController.currentBackStackEntryAsState()
    return entry?.destination?.route
}

@Composable
fun ButtomsNavigations(navController: NavHostController, navItem: List<Screens>) {
    BottomAppBar(backgroundColor = Color.White){
        BottomNavigation(backgroundColor = Color.White, modifier = Modifier.fillMaxSize()) {
            navItem.forEach{item->
                val currentRoute = currentRoute(navController = navController)
                BottomNavigationItem(
                    selected = currentRoute==item.route,
                    onClick = { navController.navigate(item.route) },
                    icon = { Icon(imageVector =  item.icon, contentDescription = null , tint = Color.Gray)},
                    alwaysShowLabel = false,
                )

            }
        }
    }
}
