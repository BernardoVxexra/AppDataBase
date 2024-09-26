package com.example.databaseapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.room.Room
import com.example.databaseapp.roomDB.Pessoa
import com.example.databaseapp.roomDB.PessoaDataBase
import com.example.databaseapp.ui.theme.DatabaseappTheme
import com.example.databaseapp.ViewModel.PessoaViewModel
import com.example.databaseapp.ViewModel.Repository



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppPreview()
        }
    }

}

@Composable
fun App(){
    var nome by remember{
        mutableStateOf("")
    }
    var telefone by remember{
        mutableStateOf("")
    }
    Column(
        Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            Modifier
                .padding(20.dp)){
        }
        Row(
            Modifier.padding(20.dp)
        ) {
            Text(
                text = "App Database",
                fontFamily = FontFamily.Monospace,
                fontSize = 26.sp,
                fontWeight = Bold,
            )
        }
        Row(
            Modifier.padding(8.dp)
        ) {
            OutlinedTextField(
                value = nome,
                onValueChange = { nome = it },
                label = { Text("Nome: ")}
            )
        }
        Row(
            Modifier.padding(8.dp)
        ) {
            OutlinedTextField(
                value = telefone,
                onValueChange = { telefone = it },
                label = { Text("Telefone: ")}
            )
        }
        Row{
            Spacer(modifier = Modifier.height(20.dp))
        }
        Row(
            Modifier.padding(8.dp)
        ) {
            Button(onClick = {}) {
                Text(
                    text = "Cadastrar",
                    fontSize = 20.sp,
                    fontWeight = Bold,
                )
            }



        }
        Row(
            Modifier
                .padding(20.dp)){
        }
    }


}

@Composable
@Preview
fun AppPreview() {
    DatabaseappTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            App()
        }
    }
}