package ni.edu.uni.agroapp.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import ni.edu.uni.agroapp.screens.HomeNav
import ni.edu.uni.agroapp.screens.LoginScreen
import ni.edu.uni.agroapp.screens.RegisterScreen
import ni.edu.uni.agroapp.screens.viewmodel.LoginViewModel

@Composable
fun NavigationHost(navController: NavHostController,isLoggedIn:Boolean,onClick: (Boolean) -> Unit){
    NavHost(
        navController = navController ,
        startDestination = Screens.Login.route
    ){
        composable(Screens.Login.route){
            LoginScreen(LoginViewModel(),navController, isLoggedIn,onClick )
        }
        composable(Screens.Register.route){
            RegisterScreen()
        }

    }
}