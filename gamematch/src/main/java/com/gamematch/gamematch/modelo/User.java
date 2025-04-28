package com.gamematch.gamematch.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public abstract class User {

    int id;
    String nomUsuario;
    String contraseña;
    String correo;

    abstract void iniciarSesion();

    abstract void cerrarSesion();
}
