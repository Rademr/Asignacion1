package com.ran.asignacion1.perfil.componentes

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview

//Historias destacadas y descripcion
@Composable
fun DescripcionHistoriasDestacadas(
    nombreH: String,
    descripcionH: String,
    modifier: Modifier = Modifier
){
    Column(modifier = modifier.fillMaxWidth()) {
        Text(text = nombreH, fontWeight = FontWeight.Black)
        Text(text = descripcionH)
    }
}

@Preview(showBackground = true)
@Composable
fun DescripcionHistoriasDestacadasPreview(){
    DescripcionHistoriasDestacadas("Historias Destacadas","Guarda tus historias favoritas en el perfil")
}