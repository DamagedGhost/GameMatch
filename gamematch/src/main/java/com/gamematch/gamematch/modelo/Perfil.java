package com.gamematch.gamematch.modelo;

//package com.example.demo.modelo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class Perfil {
    private int id;
    private User user;
    private String fotoPerfil;
    private String biografia;
    private boolean estado; //si la cuenta esta activa o inactiva
    private List<DisponibilidadHoraria> disponibilidadSemanal; //CREAR TABLA DE DISPONIBILIDAD HORARIAAAAAAAAA!!!!
    //que dias puede jugar
    private List<Juego> juegoFavoritos;
    private List<Interes> intereses; //qué cosas le gusta!!



    //me imagino que si el perfil está activo se debe mostrar

    public String mostrarPerfil() {
        if (estado == true) {
            // Aquí va lo que quieres hacer cuando 'estado' es true
            return "Perfil activo";
        } else {
            // Aquí va lo que quieres hacer cuando 'estado' es false
            return "Perfil inactivo";
        }
    }
    



}
