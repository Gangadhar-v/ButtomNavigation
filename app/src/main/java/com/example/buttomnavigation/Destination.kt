package com.example.buttomnavigation

import android.graphics.drawable.Icon
import android.media.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

interface Destination {
    val route:String
    val icon: ImageVector
    val title:String
}
//object is used to create the single instance of the class
object Home:Destination {
    override val route: String="Home"
    override val icon: ImageVector=Icons.Filled.Home
    override val title: String="Home"

}
object Call:Destination {
    override val route: String="Select"
    override val icon =Icons.Filled.Call
    override val title: String="Call"

}
object Settings:Destination {
    override val route: String="Settings"
    override val icon=Icons.Filled.Settings
    override val title: String="Settings"

}





