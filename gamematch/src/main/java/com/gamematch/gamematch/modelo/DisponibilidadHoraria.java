package com.gamematch.gamematch.modelo;

import java.time.DayOfWeek;
import java.time.LocalTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data // anotacion de Lombok para generar getters y setters
@AllArgsConstructor
@NoArgsConstructor
public class DisponibilidadHoraria {

    // atributos de la clase Disponibilidad
    //@SuppressWarnings("unused")
    private DayOfWeek dia;
    @SuppressWarnings("unused")
    private LocalTime horaInicio;
    @SuppressWarnings("unused")
    private LocalTime horaFin;

}
