package com.gamematch.gamematch.controller;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Juego {

    private Long id;
    private String nombre;
    private String genero;
    private String publicador;
    private String plataforma;
    private Date fechaLanzamiento;

}
