package com.CCLab01.Labo2.Nav

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.CCLab01.Labo2.ListNames
import com.CCLab01.Labo2.views.GyroscopeSensor
import com.CCLab01.Labo2.views.ListNames

import com.CCLab01.Labo2.views.PantallaInicio


@Composable
fun NavHostApp() {
    val navController: NavHostController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = RuteHome
    ) {
        composable<RuteHome> {
            PantallaInicio(navController)
        }


        composable<RuteList> {
            ListNames(navController)
        }

        composable<RuteSensor> {
            GyroscopeSensor(navController)
        }
    }
}



