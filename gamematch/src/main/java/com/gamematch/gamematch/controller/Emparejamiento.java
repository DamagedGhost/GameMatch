package com.gamematch.gamematch.controller;

import java.time.LocalDate;
import org.apache.catalina.User;
import lombok.Data; // anotacion de Lombok para generar getters y setters automáticamente
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data // anotacion de Lombok para generar getters y setters automáticamente
@AllArgsConstructor // anotacion de Lombok para generar un constructor con todos los atributos
@NoArgsConstructor // anotacion de Lombok para generar un constructor sin argumentos

public class Emparejamiento {

    private int idEmparejamiento;
    private User usuario1;     //private usuario1:usuario / usuario2: usuario
    private User usuario2;
    private LocalDate fechaEmparejamiento;

     //metodos
     public void EliminarEmparejamiento(){
     }

     public void UnirEmparejamiento(){
     }
}
