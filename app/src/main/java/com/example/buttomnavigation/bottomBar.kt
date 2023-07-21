package com.example.buttomnavigation

import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarDefaults
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

val destinationList = listOf(Home, Call, Settings)

@Composable
fun bottomBar(navController: NavController) { //Wrapper Class
    val selectedItem = rememberSaveable{ mutableStateOf(0) }
    NavigationBar(containerColor=MaterialTheme.colorScheme.onPrimary) {
        destinationList.forEachIndexed { index, destination ->
            NavigationBarItem(
                label = { Text(text = destination.title) },
                selected = index == selectedItem.value,
                onClick = {selectedItem.value=index
                    navController.navigate(route = destinationList[index].route){
                      popUpTo(Home.route)
                    }
                },
                icon = {
                    Icon(
                        imageVector = destination.icon,
                        contentDescription = destination.title
                    )
                })
        }
    }
}

@Preview
@Composable
fun previewBottomBar() {
    val navController = rememberNavController()
    bottomBar(navController = navController)
}
