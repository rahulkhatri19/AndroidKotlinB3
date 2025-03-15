package com.geeksforgeek.elearningapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ButtonElevation
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import coil3.request.ImageRequest
import coil3.request.crossfade
import com.geeksforgeek.elearningapp.Utility.paymentActivity

@Composable
fun DetailScreen() {
    val context = LocalContext.current
    Column(
        Modifier.fillMaxWidth()
    ) {
        AsyncImage(
            model = ImageRequest.Builder(LocalContext.current)
                .data("https://media.geeksforgeeks.org/img-practice/prod/courses/504/Mobile/Other/Course_DSA_to_Dev_1720846081.webp")
                .crossfade(true)
                .build(),
            contentDescription = "",
            contentScale = ContentScale.Crop,
            modifier = Modifier.size(height = 240.dp, width = 500.dp)
        )

        Text(
            text = "",
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(16.dp)
        )

        Row(
            modifier = Modifier
                .padding(horizontal = 16.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Card(
                modifier = Modifier.padding(8.dp),
                elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)
            ) {
                Row(
                    modifier = Modifier.padding(8.dp)
                ) {
                    Text("4.4")
                    Icon(
                        Icons.Default.Star,
                        contentDescription = "Star",
                        modifier = Modifier
                            .padding(start = 8.dp)
                            .size(20.dp)
                    )
                }
            }

            Text(
                "446+ Interested Geeks",
                modifier = Modifier.padding(top = 12.dp)
            )
        }

        Text(
            "The Complete Machine Learning & Data Science Program is a comprehensive live course designed to take you from beginner to expert in machine learning and data science. Explore a 360-degree learning experience designed for geeks who wish to get hands-on Data Science and ML. Mentored by industry experts; learn to apply DS methods and techniques, and acquire analytical skills. Join us to gain practical knowledge and become proficient in Data Science.",
            fontSize = 18.sp,
            modifier = Modifier.padding(start = 16.dp, end = 16.dp, top = 8.dp)
        )

        Button(
            onClick = {
                paymentActivity(context)
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp, top = 16.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.White),
            shape = RoundedCornerShape(6.dp),
            elevation = ButtonDefaults.elevatedButtonElevation(8.dp)
        ) {
            Text("Enroll Now", color = Color.Green)
        }
    }

}















