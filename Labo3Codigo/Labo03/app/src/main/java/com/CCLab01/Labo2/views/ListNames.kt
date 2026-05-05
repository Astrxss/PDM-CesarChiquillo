package com.CCLab01.Labo2.views

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Button
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.CCLab01.Labo2.Nav.RuteHome
import com.CCLab01.Labo2.Nav.RuteList

@Composable
fun ListNames (nav: NavHostController) {
    val nombre: MutableState<String> = remember { mutableStateOf("") };
    val listaNombres: MutableList<String> = remember { mutableStateListOf("Café") }

    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        verticalArrangement = Arrangement.SpaceBetween
    ) {


        FloatingActionButton(onClick = {  nav.navigate(RuteHome)}) {
            Icon(Icons.Default.Home, contentDescription = "Pantalla Inicio.")
        }

        Spacer(modifier = Modifier.height(25.dp))


        Spacer(modifier = Modifier.padding(16.dp))

        TextField(
            value = nombre.value,
            onValueChange = {
                nombre.value = it
            })



        Button(
            onClick = {
                listaNombres.add("${nombre.value}")
            }
        ) {
            Text(text = "Guardar")
        }


        Row(
            Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Text(text = "Listado de nombres y posiciones en lista")

            Button(
                onClick = {
                    listaNombres.clear()
                }
            ) {
                Text(text = "Limpiar")
            }
        }


        LazyColumn() {

            itemsIndexed(listaNombres.toList()) { index, item ->
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = item
                    )
                    Text(
                        text = (index + 1).toString()
                    )
                }

            }
        }


    }
}
