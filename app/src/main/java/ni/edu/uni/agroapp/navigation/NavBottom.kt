package ni.edu.uni.agroapp.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import ni.edu.uni.agroapp.screens.FirstScreen
import ni.edu.uni.agroapp.screens.Login
import ni.edu.uni.agroapp.screens.QuarterScreen
import ni.edu.uni.agroapp.screens.SecondScreen
import ni.edu.uni.agroapp.screens.ThirdScreen


@Composable
fun NavigationBottom(navController: NavHostController,modifier: Modifier = Modifier){
    NavHost(
        navController = navController ,
        startDestination = Screens.Home.route
    ){
        composable(Screens.Home.route){
            FirstScreen(navController = navController)
        }

          composable(Screens.Betwen.route){
              ThirdScreen()

          }
          composable(Screens.End.route){
              QuarterScreen()
          }
        composable(Screens.S.route){
              SecondScreen()
          }

    }
}
