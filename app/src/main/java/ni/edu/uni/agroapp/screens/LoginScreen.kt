package ni.edu.uni.agroapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.loginjetpackcompose.R
import com.example.loginjetpackcompose.ui.theme.focusedTextFieldText
import com.example.loginjetpackcompose.ui.theme.textFieldContainer
import com.example.loginjetpackcompose.ui.theme.unfocusedTextFieldText
import kotlinx.coroutines.launch

@Composable
fun LoginScreen(viewModel: LoginViewModel){
    Box(modifier = Modifier
        .fillMaxSize()
        .padding(16.dp)) {
        Login(Modifier.align(Alignment.Center), viewModel)
    }
}

@Composable
fun Login(modifier: Modifier, viewModel: LoginViewModel) {

    val email:String by viewModel.email.observeAsState(initial = "")
    val password:String by viewModel.password.observeAsState(initial = "")
    val loginEnable:Boolean by viewModel.loginEnable.observeAsState(initial = false)
    val isLoading:Boolean by viewModel.isLoading.observeAsState(initial = false)
    val coroutineScope = rememberCoroutineScope()

    if(isLoading){
        Box(modifier = Modifier.fillMaxSize()){
            CircularProgressIndicator(modifier = Modifier.align(Alignment.Center))
        }
    }else{
    Column(modifier = modifier) {
        HeaderImage(modifier = Modifier.align(Alignment.CenterHorizontally))
        Spacer(modifier = Modifier.padding(16.dp))
        EmailField(label = "Email", email = email) { viewModel.onLoginChanged(it, password) }
        Spacer(modifier = Modifier.padding(4.dp))
        PaswordField("Contraseña",password) { viewModel.onLoginChanged(email, it) }
        Spacer(modifier = Modifier.padding(8.dp))
        ForgotPassword(modifier = Modifier.align(Alignment.End))
        Spacer(modifier = Modifier.padding(8.dp))
        LoginButton(loginEnable) {
            coroutineScope.launch {
                viewModel.onLoginSelected()
            }
        }

    }
    }
}

@Composable
fun LoginButton(loginEnable: Boolean, onLoginSelected: () -> Unit) {
    Button(
        onClick = { onLoginSelected() },
        modifier = Modifier
            .fillMaxWidth()
            .height(48.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color(0xFF0CC0DF),
            contentColor = Color.White,
            disabledContainerColor = Color(0xFF096A96),
            disabledContentColor = Color.White
        ), enabled = loginEnable
    ) {
        Text(text = "Iniciar Sesión")
    }
}

@Composable
fun ForgotPassword(modifier: Modifier) {
    val text = buildAnnotatedString {
        withStyle(
            style = SpanStyle(color = Color.Black)
        ) {
            append("No tienes cuenta? ")
        }
        withStyle(
            style = SpanStyle(color = Color(0xFF03A9F4))
        ) {
            append("Registrarse")
        }
    }

    Text(
        text = text,
        modifier = modifier.clickable {  },
        fontSize = 12.sp,
        fontWeight = FontWeight.Bold,

        )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PaswordField(label:String,password:String, onTextFieldChange:(String)->Unit) {
    TextField(
        value = password,
        onValueChange = {onTextFieldChange(it)},
        modifier = Modifier.fillMaxWidth(),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
        singleLine = true,
        maxLines = 1,
        label = {
            Text(
                text = label,
                style = MaterialTheme.typography.labelMedium,
            )
        },
        colors = TextFieldDefaults.textFieldColors(
            placeholderColor = MaterialTheme.colorScheme.focusedTextFieldText,
            disabledPlaceholderColor = MaterialTheme.colorScheme.unfocusedTextFieldText,
            containerColor = MaterialTheme.colorScheme.textFieldContainer
        ),
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EmailField(email:String,label:String, onTextFieldChange:(String)->Unit) {
    TextField(
        value = email,
        onValueChange = {onTextFieldChange(it)},
        modifier = Modifier.fillMaxWidth(),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
        singleLine = true,
        maxLines = 1,
        label = {
            Text(
                text = label,
                style = MaterialTheme.typography.labelMedium,
            )
        },
        colors = TextFieldDefaults.textFieldColors(
            placeholderColor = MaterialTheme.colorScheme.focusedTextFieldText,
            disabledPlaceholderColor = MaterialTheme.colorScheme.unfocusedTextFieldText,
            containerColor = MaterialTheme.colorScheme.textFieldContainer
        ),
    )
}

@Composable
fun HeaderImage(modifier: Modifier) {
    Image(
        painter = painterResource(id = R.drawable.logo),
        contentDescription = "Logo",
        modifier = modifier
    )
}

@Preview(showSystemUi = true)
@Composable
fun LoginScreenPreview(){
    Box(modifier = Modifier
        .fillMaxSize()
        .padding(16.dp)) {
        Login(Modifier.align(Alignment.Center), LoginViewModel())
    }
}
