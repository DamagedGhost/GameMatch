package com.gamematch.gamematch.modelo;

import lombok.Data;
import lombok.NoArgsConstructor; 
import lombok.AllArgsConstructor;

@Data // anotacion de lombok para generar getters y setters
@AllArgsConstructor // anotacion de lombok para generar constructor con todos los atributos
@NoArgsConstructor // anotacion de lombok para generar constructor sin atributos

public class Juego {

    private String id;
    private String nomre;
    private String genero;
    private String publicador;
    private String plataforma;

}
