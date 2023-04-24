package com.ran.asignacion1.perfil.componentes

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.ran.asignacion1.perfil.Historia

//Lista de las historias generadas
@Composable
fun HistoriasPerfil(
    historias: List<Historia>,
    modifier: Modifier = Modifier
){
    LazyRow(modifier = modifier){
        items(historias){
            HistoriaItem(it)
            Spacer(modifier = Modifier.width(16.dp))
        }
    }
}

//Añadir una historia
@Composable
private fun HistoriaItem(
    historia: Historia,
    modifier: Modifier = Modifier
){
    Column(modifier = modifier, horizontalAlignment = Alignment.CenterHorizontally) {
        AsyncImage(
            model = historia.imagen,
            contentDescription = "Carlos Tevez",
            modifier = Modifier.clip(CircleShape).size(60.dp)
        )
        Text(text = historia.texto)
    }
}


@Preview(showBackground = true)
@Composable
fun HistoriasPerfilPreview(){
    HistoriasPerfil(emptyList())
}