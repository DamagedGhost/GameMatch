package com.gamematch.gamematch.modelo;

public class Admin extends User{
    public void iniciarSesion(){
        System.out.println(this.nomUsuario + " Ha iniciado sesion como admin.");
    }
    public void cerrarSesion(){
        System.out.println(this.nomUsuario +  " Ha cerrado sesion como admin.");
    }
}
