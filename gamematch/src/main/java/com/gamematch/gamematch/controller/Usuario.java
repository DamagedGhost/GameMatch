
// ================================
// Created by: DamagedGhost
// ================================

package com.gamematch.gamematch.controller;

// clase Usuario que hereda de la clase User
public class Usuario extends User{

    // metodo que simula el inicio de sesion
    public void iniciarSesion(){
        System.out.println(this.nomUsuario + " Ha iniciado sesion.");
    }

    // metodo que simula el cierre de sesion
    public void cerrarSesion(){
        System.out.println(this.nomUsuario +  " Ha cerrado sesion.");
    }


}
