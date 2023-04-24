package com.ran.asignacion1.perfil.componentes

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

//Header con botones de las librerias
@Composable
fun PerfilHeader(
    atrasClick:() -> Unit,
    notificacionesClick:() -> Unit,
    opcionesClick:() -> Unit,
    nombreUsuario: String,
    modifier: Modifier = Modifier
){
    Row(modifier = modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Box {
            Row(verticalAlignment = Alignment.CenterVertically){
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "flecha atras")
                }
                Spacer(modifier = Modifier.width(16.dp))
                Text(text = nombreUsuario, fontWeight = FontWeight.Bold)
            }
        }
        PerfilHeaderOptions(notificacionesClick = notificacionesClick, opcionesClick = opcionesClick)
    }
}

//Iconos notificaciones y opciones adicionales
@Composable
private fun PerfilHeaderOptions(
    notificacionesClick:() -> Unit,
    opcionesClick:() -> Unit,
    modifier: Modifier = Modifier
){
    Row(modifier = modifier) {
        IconButton(onClick = notificacionesClick) {
            Icon(imageVector = Icons.Outlined.Notifications, contentDescription = "notificaciones")
        }
        IconButton(onClick = opcionesClick) {
            Icon(imageVector = Icons.Default.MoreVert, contentDescription = "Opciones")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PerfilHeaderPreview() {
    PerfilHeader({},{},{},"Carlos Tevez")
}