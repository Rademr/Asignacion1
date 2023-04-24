package com.ran.asignacion1.perfil.componentes

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MonotonicFrameClock
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import java.io.FileDescriptor

//Nombre del perfil y descripcion
@Composable
fun DescripcionPerfil(
    nombre: String,
    descripcion: String,
    modifier: Modifier = Modifier
){
    Column(modifier = modifier.fillMaxWidth()) {
        Text(text = nombre, fontWeight = FontWeight.Black)
        Text(text = descripcion)
    }
}

@Preview(showBackground = true)
@Composable
fun DescripcionPerfilPreview(){
    DescripcionPerfil("Carlos Tevez","SIU")
}