package com.ran.asignacion1.perfil.componentes

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage

//Fila con foto, publicaciones, seguidores y seguidos
@Composable
fun InformacionPerfil(
    imagenUrl: String,
    publicaciones: Int,
    seguidores: Int,
    seguidos: Int,
    modifier: Modifier = Modifier
){
    Row(modifier = modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.SpaceAround){
        //Imagen + Nombre
        AsyncImage(
            model = imagenUrl,
            contentDescription = "Carlos Tevez",
            modifier = Modifier.clip(CircleShape).size(50.dp)
        )
        InformacionPerfilItem(publicaciones, type = "Publicaciones")
        InformacionPerfilItem(seguidores, type = "Seguidores")
        InformacionPerfilItem(seguidos, type = "Seguidos")
    }
}

//Variables cantidad y tipo para la informacion del perfil
@Composable
private fun InformacionPerfilItem(
    amount: Int,
    type: String,
    modifier: Modifier = Modifier
){
    Column(modifier = modifier, horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = amount.toString(), fontWeight = FontWeight.Bold)
        Text(text = type)
    }
}

@Preview(showBackground = true)
@Composable
fun InformacionPerfilPreview(){
    InformacionPerfil("",52,52,52)
}