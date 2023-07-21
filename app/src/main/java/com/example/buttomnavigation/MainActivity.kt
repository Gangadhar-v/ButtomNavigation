package com.example.buttomnavigation

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.rememberNavController
import com.example.buttomnavigation.ui.theme.ButtomNavigationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ButtomNavigationTheme {
                // A surface container using the 'background' color from the theme
                mainScreen()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun mainScreen() {
    val scrollBehavior = TopAppBarDefaults.pinnedScrollBehavior()
    val navController = rememberNavController() //type inference in kotlin
    Scaffold(
        modifier=Modifier.nestedScroll(scrollBehavior.nestedScrollConnection),
        bottomBar = { bottomBar(navController = navController) },
        content = {
        myNavigation(
            navController = navController, paddingValue = it
        )
    }, topBar = {
        TopAppBar(scrollBehavior = scrollBehavior,
            colors = TopAppBarDefaults.smallTopAppBarColors(),
            title = {
                Row(modifier = Modifier.fillMaxWidth()) {
                    Text(text = "Tech Gang", fontSize = 25.sp)
                    Spacer(modifier = Modifier.width(5.dp))
                    Image(
                        modifier = Modifier
                            .size(30.dp)
                            .padding(top = 3.dp),
                        imageVector = Icons.Default.CheckCircle,
                        contentDescription = null
                    )
                }
            })
    })
}

@Preview
@Composable
fun previewMainScreen() {
    mainScreen()
}