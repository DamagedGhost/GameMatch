package com.gamematch.gamematch.controller;

import java.time.LocalDateTime;
import org.apache.catalina.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // anotacion de Lombok para generar getters y setters
@AllArgsConstructor // anotacion de Lombok para generar constructor con todos los atributos
@NoArgsConstructor // anotacion de Lombok para generar constructor sin argumentos

public class Mensaje {
    
    private String idMensaje, nombre, genero;
    private LocalDateTime fechaEnvio, fechaLeido;
    private User emisor, receptor;

    public void EliminarMensaje(){
    }

    public void ReportarMensaje(){
    }

}
