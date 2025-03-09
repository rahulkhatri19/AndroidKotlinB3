package com.geeksforgeek.elearningapp.bottomNav

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.ui.graphics.vector.ImageVector
import com.geeksforgeek.elearningapp.bottomNav.CourseNavigation.HOME
import com.geeksforgeek.elearningapp.bottomNav.CourseNavigation.EXPLORE
import com.geeksforgeek.elearningapp.bottomNav.CourseNavigation.MY_COURSE
import com.geeksforgeek.elearningapp.bottomNav.CourseNavigation.PROFILE

sealed class BottomNavItem(val route: String, val icon: ImageVector, val label: String) {
    data object Home : BottomNavItem(HOME, Icons.Default.Home, HOME)
    data object Explore : BottomNavItem(EXPLORE, Icons.Default.Search, EXPLORE)
    data object Courses : BottomNavItem(MY_COURSE, Icons.Default.Info, MY_COURSE)
    data object Profile : BottomNavItem(PROFILE, Icons.Default.Person, PROFILE)
}