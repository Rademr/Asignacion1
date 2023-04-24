package com.ran.asignacion1.perfil

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ran.asignacion1.perfil.componentes.AccionesPerfil
import com.ran.asignacion1.perfil.componentes.DescripcionHistoriasDestacadas
import com.ran.asignacion1.perfil.componentes.DescripcionPerfil
import com.ran.asignacion1.perfil.componentes.FotosPerfil
import com.ran.asignacion1.perfil.componentes.HistoriasPerfil
import com.ran.asignacion1.perfil.componentes.InformacionPerfil
import com.ran.asignacion1.perfil.componentes.PerfilHeader

@Composable
fun PerfilScreen(){
    //definimos Usuario con todas las variables
    val user = Usuario(
        usuario = "Carlos Tevez",
        imagenPerfilUrl = "https://as01.epimg.net/img/comunes/fotos/fichas/deportistas/t/tev/100/16116.jpg",
        publicaciones = 52,
        seguidores = 52,
        seguidos = 52,
        nombre = "Carlos Tevez",
        descripcion = "SIU",
        nombreH= "Historias Destacadas",
        descripcionH = "Guarda tus historias favoritas en el perfil",
        historias = listOf(
            Historia(imagen = "https://i.imgur.com/4ZWilrW.png", texto = "Nueva"),
            Historia(imagen = "https://as01.epimg.net/img/comunes/fotos/fichas/deportistas/t/tev/100/16116.jpg", texto = "Hist 1"),
            Historia(imagen = "https://as01.epimg.net/img/comunes/fotos/fichas/deportistas/t/tev/100/16116.jpg", texto = "Hist 2"),
            Historia(imagen = "https://as01.epimg.net/img/comunes/fotos/fichas/deportistas/t/tev/100/16116.jpg", texto = "Hist 3"),
            Historia(imagen = "https://as01.epimg.net/img/comunes/fotos/fichas/deportistas/t/tev/100/16116.jpg", texto = "Hist 4"),
            Historia(imagen = "https://as01.epimg.net/img/comunes/fotos/fichas/deportistas/t/tev/100/16116.jpg", texto = "Hist 5"),
        ),
        posts = listOf(
            "https://www.notigatos.es/wp-content/uploads/2015/08/gato_con_botas.jpg.webp",
            "https://www.notigatos.es/wp-content/uploads/2015/08/gato_con_botas.jpg.webp",
            "https://www.notigatos.es/wp-content/uploads/2015/08/gato_con_botas.jpg.webp",
            "https://www.notigatos.es/wp-content/uploads/2015/08/gato_con_botas.jpg.webp",
            "https://www.notigatos.es/wp-content/uploads/2015/08/gato_con_botas.jpg.webp",
            "https://www.notigatos.es/wp-content/uploads/2015/08/gato_con_botas.jpg.webp",
            "https://www.notigatos.es/wp-content/uploads/2015/08/gato_con_botas.jpg.webp",
            "https://www.notigatos.es/wp-content/uploads/2015/08/gato_con_botas.jpg.webp",
            "https://www.notigatos.es/wp-content/uploads/2015/08/gato_con_botas.jpg.webp",
            "https://www.notigatos.es/wp-content/uploads/2015/08/gato_con_botas.jpg.webp",
            "https://www.notigatos.es/wp-content/uploads/2015/08/gato_con_botas.jpg.webp",
            "https://www.notigatos.es/wp-content/uploads/2015/08/gato_con_botas.jpg.webp",
            "https://www.notigatos.es/wp-content/uploads/2015/08/gato_con_botas.jpg.webp",
            "https://www.notigatos.es/wp-content/uploads/2015/08/gato_con_botas.jpg.webp",
            "https://www.notigatos.es/wp-content/uploads/2015/08/gato_con_botas.jpg.webp",
            "https://www.notigatos.es/wp-content/uploads/2015/08/gato_con_botas.jpg.webp",
            "https://www.notigatos.es/wp-content/uploads/2015/08/gato_con_botas.jpg.webp",
            "https://www.notigatos.es/wp-content/uploads/2015/08/gato_con_botas.jpg.webp",
            "https://www.notigatos.es/wp-content/uploads/2015/08/gato_con_botas.jpg.webp",
            "https://www.notigatos.es/wp-content/uploads/2015/08/gato_con_botas.jpg.webp",
            "https://www.notigatos.es/wp-content/uploads/2015/08/gato_con_botas.jpg.webp",
            "https://www.notigatos.es/wp-content/uploads/2015/08/gato_con_botas.jpg.webp",
            "https://www.notigatos.es/wp-content/uploads/2015/08/gato_con_botas.jpg.webp",
            "https://www.notigatos.es/wp-content/uploads/2015/08/gato_con_botas.jpg.webp",
            "https://www.notigatos.es/wp-content/uploads/2015/08/gato_con_botas.jpg.webp",
            "https://www.notigatos.es/wp-content/uploads/2015/08/gato_con_botas.jpg.webp",
            "https://www.notigatos.es/wp-content/uploads/2015/08/gato_con_botas.jpg.webp",
            "https://www.notigatos.es/wp-content/uploads/2015/08/gato_con_botas.jpg.webp"
        )
    )

    //Componentes

    Column {
        PerfilHeader(
            atrasClick = { /*TODO*/ },
            notificacionesClick = { /*TODO*/ },
            opcionesClick = { /*TODO*/ },
            nombreUsuario = user.usuario
        )
        InformacionPerfil(
            imagenUrl = user.imagenPerfilUrl,
            publicaciones = user.publicaciones,
            seguidores = user.seguidores,
            seguidos = user.seguidos
        )
        DescripcionPerfil(
            nombre = user.nombre,
            descripcion = user.descripcion,
            modifier = Modifier.padding(16.dp))
        AccionesPerfil()
        DescripcionHistoriasDestacadas(
            nombreH = user.nombreH,
            descripcionH = user.descripcionH
        )
        HistoriasPerfil(
            historias = user.historias
        )
        FotosPerfil(imagenes = user.posts)
    }
}


@Preview(showBackground = true)
@Composable
fun PerfilScreenPreview() {
    PerfilScreen()
}
