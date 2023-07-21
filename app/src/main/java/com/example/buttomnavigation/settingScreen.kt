package com.example.buttomnavigation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Warning
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

data class SettingsItem(val icon: ImageVector, val title: String, val description: String)

val s1 = SettingsItem(Icons.Filled.Person, "Sign in to account", "Enjoy app service")
val s2 =
    SettingsItem(Icons.Filled.Notifications, "Notifications", "Notification History,conversation")
val s3 = SettingsItem(Icons.Filled.LocationOn, "Location", "On - 24 apps have access to location")
val s4 = SettingsItem(Icons.Filled.Lock, "Security", "Password,fingerprint, and face")
val s5 = SettingsItem(Icons.Filled.Warning, "Cautions", "List of warnings to follow")
val s6 = SettingsItem(Icons.Filled.Call, "Call Settings", "About calling ")
val s7 = SettingsItem(Icons.Filled.Delete, "Delete", "Delete trash memory")
val s8 = SettingsItem(Icons.Filled.Info, "Info", "Information and guidance about mobile software")
val s9 = SettingsItem(Icons.Filled.DateRange, "DataRange", "DataRange")
val s10 = SettingsItem(Icons.Filled.Refresh, "Refresh", "Refresh setting to default")

val settingItemList = listOf(s1, s2, s3, s4, s5, s6, s7, s8, s9, s10)


@Composable
fun settingScreen(paddingValues: PaddingValues) {
    Column(
        modifier = Modifier
            .padding(
                top = paddingValues.calculateTopPadding(),
                start = 2.dp,
                end = 2.dp,
                bottom = 2.dp
            )
            .background(Color.White)
    ) {

        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
        ) {
            items(settingItemList) { item ->
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(7.dp)
                ) {
                    Row() {
                        Icon(
                            modifier = Modifier.padding(top = 4.dp),
                            imageVector = item.icon,
                            contentDescription = item.title
                        )
                        Spacer(modifier = Modifier.width(2.dp))
                        Text(
                            text = item.title,
                            fontWeight = FontWeight.Normal ,
                            fontSize = 25.sp,
                            color = Color.Black
                        )
                    }
                    Text(
                        modifier = Modifier.padding(start = 3.dp),
                        text = item.description,
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 20.sp,
                        color = Color.Gray
                    )
                }
            }
        }
    }
}



