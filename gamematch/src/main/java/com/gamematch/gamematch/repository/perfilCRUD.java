package com.gamematch.gamematch.repository;
//capa de acceso a datos encargada cn bbdd.

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import com.gamematch.gamematch.modelo.DisponibilidadHoraria;
import com.gamematch.gamematch.modelo.Perfil;

public class perfilCRUD  {
    //atributos de la clase perfilCRUD
    ArrayList<Perfil> perfiles = new ArrayList<>(); // lista de perfiles en memoria

    //agregar un peril a la bbdd
    public void agregarPerfil(Perfil p) {
        perfiles.add(p); // agrega el perfil a la lista
        System.out.println("Perfil agregado: " + p.toString()); // imprime el perfil agregado
    }
    //eliminar un perfil de la bbdd
    public void eliminarPerfil(Perfil p) {
        perfiles.remove(p); // elimina el perfil de la lista
        System.out.println("Perfil eliminado: " + p.toString()); // imprime el perfil eliminado
    }
    //modificar un perfil de la bbdd

    //modificar biografia de un perfil
    public void modificarBiografia(Perfil p, String biografia) {
        for (Perfil perfil : perfiles) { // recorre la lista de perfiles
            if (perfil.equals(p)) { // si el perfil es igual al que se busca
                perfil.setBiografia(biografia); // modifica la biografía del perfil
                System.out.println("Biografía modificada: " + perfil.toString()); // imprime el perfil modificado
            }
        }
        }

    //modificar foto de perfil de un perfil
    public void modificarFotoPerfil(Perfil p, String fotoPerfil) {
        for (Perfil perfil : perfiles) { // recorre la lista de perfiles
            if (perfil.equals(p)) { // si el perfil es igual al que se busca
                perfil.setFotoPerfil(fotoPerfil); // modifica la foto de perfil del perfil
                System.out.println("Foto de perfil modificada: " + perfil.toString()); // imprime el perfil modificado
            }
        }}

    //modificar estado de un perfil
    public void modificarEstado(Perfil p, boolean estado) {
        for (Perfil perfil : perfiles) { // recorre la lista de perfiles
            if (perfil.equals(p)) { // si el perfil es igual al que se busca
                perfil.setEstado(estado); // modifica el estado del perfil
                System.out.println("Estado modificado: " + perfil.toString()); // imprime el perfil modificado
            }
        }}
    //modificar disponibilidad horaria de un perfil
    public void DisponibilidadHoraria(String horario) {
        try {
            String[] partes = horario.split(",");
            this.dia = DayOfWeek.valueOf(partes[0].trim().toUpperCase());
            this.horaInicio = LocalTime.parse(partes[1].trim());
            this.horaFin = LocalTime.parse(partes[2].trim());
        } catch (Exception e) {
            throw new IllegalArgumentException("Formato inválido para disponibilidad: " + horario);
        }
    }

    //modificar intereses de un perfil
    public void modificarIntereses(Perfil p, List<String> intereses) {
        for (Perfil perfil : perfiles) { // recorre la lista de perfiles
            if (perfil.equals(p)) { // si el perfil es igual al que se busca
                perfil.setIntereses(intereses); // modifica los intereses del perfil
                System.out.println("Intereses modificados: " + perfil.toString()); // imprime el perfil modificado
            }
        }}
    //modificar juegos de un perfil
    public void modificarJuegos(Perfil p, List<String> juegos) {
        for (Perfil perfil : perfiles) { // recorre la lista de perfiles
            if (perfil.equals(p)) { // si el perfil es igual al que se busca
                perfil.setJuegos(juegos); // modifica los juegos del perfil
                System.out.println("Juegos modificados: " + perfil.toString()); // imprime el perfil modificado
            }
        }}
        
    //mostrar todos los perfiles de la bbdd
    public void mostrarPerfiles() {
        for (Perfil p : perfiles) { // recorre la lista de perfiles
            System.out.println(p.toString()); // imprime el perfil
        }
    }
    //buscar un perfil por su id
    public Perfil buscarPerfilPorId(int id) {
        for (Perfil perfil : perfiles) { // recorre la lista de perfiles
            if (perfil.getId() == id) { // si el id del perfil es igual al que se busca
                System.out.println("Perfil encontrado: " + perfil.toString()); // imprime el perfil encontrado
                return perfil; // devuelve el perfil encontrado
            }
        }
        System.out.println("Perfil no encontrado con ID: " + id); // imprime que no se encontró el perfil
        return null; // devuelve null si no se encontró el perfil
    }
    //listar todos los perfiles de la bbdd
    public ArrayList<Perfil> listarPerfiles() {
        return perfiles; // devuelve la lista de perfiles
    }
    //buscar un perfil por su nombre
    public Perfil buscarPerfilPorNombre(String nombre) {
        for (Perfil perfil : perfiles) { // recorre la lista de perfiles
            if (perfil.getNombre().equals(nombre)) { // si el nombre del perfil es igual al que se busca
                System.out.println("Perfil encontrado: " + perfil.toString()); // imprime el perfil encontrado
                return perfil; // devuelve el perfil encontrado
            }
        }
        System.out.println("Perfil no encontrado con nombre: " + nombre); // imprime que no se encontró el perfil
        return null; // devuelve null si no se encontró el perfil
    }
    //buscar un perfil por su id de usuario 
    public Perfil buscarPerfilPorIdUsuario(int idUsuario) {
        for (Perfil perfil : perfiles) { // recorre la lista de perfiles
            if (perfil.getIdUsuario() == idUsuario) { // si el id de usuario del perfil es igual al que se busca
                System.out.println("Perfil encontrado: " + perfil.toString()); // imprime el perfil encontrado
                return perfil; // devuelve el perfil encontrado
            }
        }
        System.out.println("Perfil no encontrado con ID de usuario: " + idUsuario); // imprime que no se encontró el perfil
        return null; // devuelve null si no se encontró el perfil
    }

}
