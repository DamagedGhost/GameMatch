package com.gamematch.gamematch.modelo;

public class Usuario extends User{

    public void iniciarSesion(){
        System.out.println(this.nomUsuario + " Ha iniciado sesion.");
    }

    public void cerrarSesion(){
        System.out.println(this.nomUsuario +  " Ha cerrado sesion.");
    }


}
