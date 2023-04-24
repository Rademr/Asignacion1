package com.ran.asignacion1.perfil.componentes


import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage


//Lista que muestra 3 Imagenes por fila
@OptIn(ExperimentalFoundationApi::class)
@Composable
fun FotosPerfil(
    imagenes: List<String>,
    modifier: Modifier = Modifier
){
    LazyVerticalGrid(modifier= modifier, columns = GridCells.Fixed(3)){
        items(imagenes){
            PublicarItem(imagenUrl = it)
        }
    }
}

//Añadir una publicacion
@Composable
private fun PublicarItem(
    imagenUrl: String,
    modifier: Modifier = Modifier
){
    Box( modifier = modifier){
        AsyncImage(model = imagenUrl, contentDescription = "publicacion usuario",modifier= modifier.padding(1.dp))
    }
}

@Preview(showBackground = true)
@Composable
fun FotosPerfilPreview(){
    FotosPerfil(emptyList())
}