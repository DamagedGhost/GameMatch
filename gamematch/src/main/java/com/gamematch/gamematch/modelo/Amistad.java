package com.gamematch.gamematch.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //anotacion para generar los metodos get y set
@AllArgsConstructor //anotacion para generar el constructor con todos los atributos
@NoArgsConstructor //anotacion para generar el constructor sin atributos

public class Amistad {

    private String idAmistad, nombre, genero, publicador, plataforma ;

    //metodos
    public void AgregarAmistad(){
    }

    public void EliminarAmistad(){
    }

    public void ListarAmistad(){
    }

    public void ModificarAmistad(){
    }




}
