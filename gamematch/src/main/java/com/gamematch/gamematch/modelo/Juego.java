package com.gamematch.gamematch.modelo;

// import lombok.Data;
// import lombok.NoArgsConstructor; 
// import lombok.AllArgsConstructor;

//@Data // anotacion de lombok para generar getters y setters
//@AllArgsConstructor // anotacion de lombok para generar constructor con todos los atributos
//@NoArgsConstructor // anotacion de lombok para generar constructor sin atributos
//@Entity
//@id
//@Table(name = "juegos")
public class Juego {

    //@id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @SuppressWarnings("unused")
    private Long id;
    @SuppressWarnings("unused")
    private String nombre;
    @SuppressWarnings("unused")
    private String genero;
    @SuppressWarnings("unused")
    private String publicador;
    @SuppressWarnings("unused")
    private String plataforma;

}
