package com.CCLab01.Labo2.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.List
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.CCLab01.Labo2.Nav.RuteList
import com.CCLab01.Labo2.Nav.RuteSensor

@Composable
fun PantallaInicio(nav: NavHostController){

    Column(modifier = Modifier.fillMaxSize().padding(20.dp).background(color = Color.White)) {

        FloatingActionButton(onClick = {  nav.navigate(RuteList)}) {
            Icon(Icons.Default.List, contentDescription = "Pantalla Lista.")
        }

        Spacer(modifier = Modifier.height(25.dp))

        FloatingActionButton(onClick = { nav.navigate(RuteSensor)}) {
            Icon(Icons.Default.Build, contentDescription = "Pantalla Sensores")
        }

    }
}