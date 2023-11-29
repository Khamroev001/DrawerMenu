package com.example.drawermenu

sealed class Screen(val route: String, val title: String)
{
object HomeScreen : Screen("home", "Home")
object ProfileScreen : Screen("profile", "Profile")
object SettingsScreen : Screen("settings", "Settings")}