package com.example.buttomnavigation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

data class CallingItems(val alphabet:Char,val name:String,val color:Color)

val c1=CallingItems('A',"Amit Shah",Color(0.2f,.4f,.6f,1f))
val c2=CallingItems('B',"Bheem sen joshi",Color(0.4f,.3f,.5f,1f) )
val c3=CallingItems('C',"Chanaakya",Color(0.2f,.7f,.4f,1f))
val c4=CallingItems('D',"Dharmendar",Color(0.8f,.3f,.4f,1f))
val c5=CallingItems('E',"Ekalavya",Color(0.0f,.3f,.4f,1f))
val c6=CallingItems('P',"Poorvi kalyani", Color(0.0f,.5f,.3f,1f))
val c7=CallingItems('T',"Tech gang",Color(0.2f,.0f,.4f,1f))
val c8=CallingItems('N',"Narendra Modi",Color(0.4f,.16f,.32f,1f))
val c9=CallingItems('V',"Veer Savarkar",Color(0.2f,.8f,.12f,1f) )
val c10=CallingItems('V',"Vadivel", Color(0.3f,.6f,.9f,1f))
val c11=CallingItems('Y',"Yamuna", Color(0.3f,.4f,.0f,1f) )

val callingItems = listOf(c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11)
@Composable
fun callScreen(paddingValues: PaddingValues) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(
                top = paddingValues.calculateTopPadding(),
                start = 1.dp,
                end = 1.dp,
                bottom = 1.dp
            )
    ) {
        LazyColumn(){
            items(callingItems){
                item: CallingItems ->
                Row(modifier= Modifier
                    .fillMaxWidth()
                    .padding(5.dp)) {
                    Box(modifier= Modifier
                        .size(40.dp)
                        .clip(CircleShape)
                        .background(item.color),contentAlignment = Alignment.Center ) {
                        Text(modifier= Modifier
                            .fillMaxSize()
                            .padding(top = 3.dp),text = item.alphabet.toString(),color=Color.White,textAlign = TextAlign.Center,fontSize =25.sp)
                    }
                    Column() {
                        Text(
                            modifier = Modifier
                                .padding(start = 10.dp),
                            text = item.name,
                            fontWeight = FontWeight.Normal,
                            fontSize = 30.sp,
                            color = Color.Black
                        )
                        Text(text = "Jio 6G Sim1",fontSize=14.sp,color=Color.DarkGray,modifier=Modifier.padding(start=10.dp) )
                    }
                    Column(modifier= Modifier
                        .weight(.3f)
                        .padding(top = 5.dp, end = 7.dp),horizontalAlignment =Alignment.End) {
                        Icon(imageVector = Icons.Default.Call , contentDescription ="call",modifier=Modifier.size(25.dp) )
                    }
                }
            }
        }
    }
}
@Preview
@Composable
fun previewCallScreen(){
    val paddingValue= PaddingValues(63.dp)
    callScreen(paddingValues =paddingValue )
}
