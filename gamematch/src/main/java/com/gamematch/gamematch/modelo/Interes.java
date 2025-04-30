package com.gamematch.gamematch.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data // anotacion de Lombok para generar getters y setters
@AllArgsConstructor // anotacion de Lombok para generar constructor con todos los atributos
@NoArgsConstructor // anotacion de Lombok para generar constructor sin argumentos


public class Interes {
        @SuppressWarnings("unused")
        private int idInteres;
        @SuppressWarnings("unused")           // Identificador único para el interés
        private String nombreInteres;    // Nombre del interés (por ejemplo, "Música")

}
