package com.geeksforgeek.elearningapp.bottomNav

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.geeksforgeek.elearningapp.DetailScreen
import com.geeksforgeek.elearningapp.ExploreScreen
import com.geeksforgeek.elearningapp.HomeScreen
import com.geeksforgeek.elearningapp.MyCourseScreen
import com.geeksforgeek.elearningapp.ProfileScreen
import com.geeksforgeek.elearningapp.bottomNav.CourseNavigation.DETAILED_SCREEN

@Composable
fun CourseNavigation(navController: NavHostController) {
    NavHost(navController = navController, startDestination = BottomNavItem.Home.route){
        composable(BottomNavItem.Home.route){
            HomeScreen(navController)
        }
        composable(BottomNavItem.Explore.route){
            ExploreScreen()
        }
        composable(BottomNavItem.Courses.route){
            MyCourseScreen()
        }
        composable(BottomNavItem.Profile.route){
            ProfileScreen()
        }
        composable(DETAILED_SCREEN){
            DetailScreen()
        }
    }
}

object CourseNavigation {
    const val HOME = "home"
    const val EXPLORE = "explore"
    const val MY_COURSE = "my_course"
    const val PROFILE = "profile"
    const val DETAILED_SCREEN = "detail_screen"
}