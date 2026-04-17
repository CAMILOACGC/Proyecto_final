package com.example.proyecto_final

sealed class Screen(val route: String) {
    object Dashboard : Screen("dashboard")
    object RegisterMotorcycle : Screen("register_motorcycle")
    object Maintenance : Screen("maintenance")
    object Documents : Screen("documents")
    object GPS : Screen("gps")
}
