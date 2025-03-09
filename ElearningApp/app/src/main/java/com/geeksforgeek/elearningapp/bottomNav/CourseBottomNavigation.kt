package com.geeksforgeek.elearningapp.bottomNav

import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState

@Composable
fun CourseBottomNavigation(navController: NavHostController, bottomNavList: List<BottomNavItem>) {
    NavigationBar {
        val currentRoute = createRoute(navController)
        bottomNavList.forEach { bottom ->
            NavigationBarItem(
                icon = {
                    Icon(bottom.icon, contentDescription = bottom.label)
                },
                label = {
                    Text(bottom.label)
                },
                selected = currentRoute == bottom.route,
                onClick = {
                    if (currentRoute != bottom.route) {
                        navController.navigate(bottom.route)
                    }
                }
            )
        }
    }
}

@Composable
fun createRoute(navHostController: NavHostController): String? {
    val navBackStackEntry by navHostController.currentBackStackEntryAsState()
    return navBackStackEntry?.destination?.route
}