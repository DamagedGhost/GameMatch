package com.gamematch.gamematch.modelo;

import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data // anotacion de Lombok para generar getters y setters
@AllArgsConstructor // anotacion de Lombok para generar constructor con todos los atributos
@NoArgsConstructor // anotacion de Lombok para generar constructor sin argumentos


public class Interes {
        private int idInteres;      // Identificador único para el interés
        private String nombreInteres;
        private ArrayList<Juego> juego;   // Nombre del interés (por ejemplo, "Música")

}
