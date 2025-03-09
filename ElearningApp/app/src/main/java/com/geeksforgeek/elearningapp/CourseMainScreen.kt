package com.geeksforgeek.elearningapp

import android.annotation.SuppressLint
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.geeksforgeek.elearningapp.bottomNav.BottomNavItem
import com.geeksforgeek.elearningapp.bottomNav.CourseBottomNavigation
import com.geeksforgeek.elearningapp.bottomNav.CourseNavigation

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun CourseMainScreen(modifier: Modifier){

    val navController = rememberNavController()

    val bottomNavList = listOf(
        BottomNavItem.Home,
        BottomNavItem.Explore,
        BottomNavItem.Courses,
        BottomNavItem.Profile
    )

    Scaffold(
        bottomBar = {
            CourseBottomNavigation(navController, bottomNavList)
        }
    ) {
        CourseNavigation(navController)
    }
}