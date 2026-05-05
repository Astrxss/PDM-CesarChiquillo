package com.CCLab01.Labo2.views

import android.hardware.Sensor
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.CCLab01.Labo2.Nav.RuteHome
import com.CCLab01.Labo2.Nav.RuteList

@Composable
fun GyroscopeSensor (nav: NavHostController) {
    val gyroscopeValues = useSensor(Sensor.TYPE_GYROSCOPE)

    Scaffold { innerPadding ->
        Column (
            modifier = Modifier.fillMaxSize().padding(innerPadding),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            FloatingActionButton(onClick = {  nav.navigate(RuteHome)}) {
                Icon(Icons.Default.Home, contentDescription = "Pantalla Inicio.")
            }

            Spacer(modifier = Modifier.height(25.dp))

            Text(text = "Giroscopio", fontSize = 24.sp, fontWeight = FontWeight.Bold)
            Text(text = "X:${gyroscopeValues[0]}", fontSize = 18.sp)
            Text(text = "Y:${gyroscopeValues[1]}", fontSize = 18.sp)
            Text(text = "Z:${gyroscopeValues[2]}", fontSize = 18.sp)
        }
    }
}