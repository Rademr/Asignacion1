package com.ran.asignacion1.perfil.componentes


import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

//Botones de editar perfil, compartir y agregar
@Composable
fun AccionesPerfil(
    modifier: Modifier = Modifier
){
    Row(modifier = modifier) {
        BotonPerfil(onClick = { /*TODO*/ }, text = "Editar Perfil", modifier.weight(1f))
        Spacer(modifier = Modifier.width(8.dp))
        BotonPerfil(onClick = { /*TODO*/ }, text = "Compartir Perfil",modifier.weight(1f))
        Spacer(modifier = Modifier.width(8.dp))
        Button(onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(containerColor = Color.Green)) {
            Icon(imageVector = Icons.Default.Person, contentDescription = "Agregar Amigo")
        }
    }
}

//Opciones de botones
@Composable
private fun BotonPerfil(onClick: () -> Unit, text: String, modifier: Modifier = Modifier) {
    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(containerColor = Color.Green),
        modifier = modifier
    ) {
        Text(text = text)
    }
}

@Preview(showBackground = true)
@Composable
fun AccionesPerfilPreview(){
    AccionesPerfil()
}