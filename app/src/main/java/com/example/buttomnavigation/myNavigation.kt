package com.example.buttomnavigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun myNavigation(navController: NavHostController, paddingValue: PaddingValues){

    NavHost(navController = navController , startDestination =Home.route ){
        composable(Home.route){
            homeScreen(paddingValue)
        }
        composable(Call.route){
            callScreen(paddingValue)
        }
        composable(Settings.route){
            settingScreen(paddingValue)
        }
    }
}
