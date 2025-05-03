package com.gamematch.gamematch.modelo;

import java.time.LocalDateTime;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // anotacion de Lombok para generar getters y setters automáticamente
@AllArgsConstructor // anotacion de Lombok para generar un constructor con todos los atributos
@NoArgsConstructor // anotacion de Lombok para generar un constructor sin argumentos

public class Chat {
    
    private String idChat;
    private List<String> participantes;
    private List<String> mensajes;
    private LocalDateTime fechaCreacion;
    
    public void Crearchat(){
    }

    public void EliminarChat(){
    }

    public void AgregarMensaje(){
    } 

}
