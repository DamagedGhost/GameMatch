
// ================================
// Created by: DamagedGhost
// ================================

package com.gamematch.gamematch.modelo;

// Importa las librerías necesarias: Lombok para la generación automática de código y las anotaciones de la clase.
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// Argumentos de la clase: @Data, @AllArgsConstructor y @NoArgsConstructor son anotaciones de Lombok que generan automáticamente métodos como getters, setters y constructores.
@Data
@AllArgsConstructor
@NoArgsConstructor

// La clase User es una clase abstracta que representa un usuario en el sistema.
public abstract class User {

    // Atributos de la clase User:
    int id;
    String nomUsuario;
    String contraseña;
    String correo;

}
