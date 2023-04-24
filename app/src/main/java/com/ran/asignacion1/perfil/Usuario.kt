package com.ran.asignacion1.perfil

data class Usuario(
    val usuario: String,
    val imagenPerfilUrl: String,
    val publicaciones: Int,
    val seguidores: Int,
    val seguidos: Int,
    val nombre: String,
    val descripcion: String,
    val historias: List<Historia>,
    val posts: List<String>,
    val nombreH: String,
    val descripcionH: String
)
data class Historia(
    val imagen:String,
    val texto: String
)
