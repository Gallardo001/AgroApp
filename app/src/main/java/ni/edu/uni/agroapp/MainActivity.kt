package ni.edu.uni.agroapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import ni.edu.uni.agroapp.navigation.NavigationBottom
import ni.edu.uni.agroapp.navigation.NavigationHost
import ni.edu.uni.agroapp.navigation.Screens
import ni.edu.uni.agroapp.screens.HomeNav
import ni.edu.uni.agroapp.screens.LoginScreen
import ni.edu.uni.agroapp.screens.viewmodel.LoginViewModel
import ni.edu.uni.agroapp.ui.theme.AgroAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AgroAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    
                    var isLoggedIn by remember { mutableStateOf(false) }
                    val navController = rememberNavController()
                    if (!isLoggedIn) {
                        NavigationHost(navController = navController, isLoggedIn = isLoggedIn ,{ isLoggedIn = it})
                    }
                    else{
                       HomeNav(navController = navController)
                    }
                }
            }
        }
    }
}
