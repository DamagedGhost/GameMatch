
// ================================
// Created by: DamagedGhost
// ================================

package com.gamematch.gamematch.modelo;

// clase administrador que hereda de la clase usuario
public class Admin extends User{

    // metodo que simula el inicio de sesion del administrador
    public void iniciarSesion(){
        System.out.println(this.nomUsuario + " Ha iniciado sesion como admin.");
    }

    // metodo que simula el cierre de sesion del administrador
    public void cerrarSesion(){
        System.out.println(this.nomUsuario +  " Ha cerrado sesion como admin.");
    }

    //prueba 2
}
