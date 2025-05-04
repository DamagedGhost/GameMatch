package com.gamematch.gamematch.repository;


import java.util.ArrayList;
import java.util.List;

import com.gamematch.gamematch.modelo.Mensaje;


public class mensajeCRUD {
    ArrayList<Mensaje> mensajes = new ArrayList<>();
    
    public void AgregarMensaje(Mensaje mensaje) {
        mensajes.add(mensaje);
        System.out.println("Mensaje agregado: " + mensaje);
    }

    public boolean eliminarMensaje(String id) {
        Mensaje mensaje = buscarPorId(id);
        if (mensaje != null) {
            mensajes.remove(mensaje);
            System.out.println("Mensaje eliminado: " + mensaje);
            return true;
        }
        System.out.println("Mensaje no encontrado para eliminar.");
        return false;
    }

    public List<Mensaje> MostrarMensajes(){
        return new ArrayList<>(mensajes);
    }

    public Mensaje buscarPorId(String id) {
        for (Mensaje mensaje : mensajes) {
            if (mensaje.getIdMensaje() == id) {
                return mensaje;
            }
        }
        return null;
    }

    public boolean editarMensaje(String id, String nuevoContenido) {
        Mensaje mensaje = buscarPorId(id);
        if (mensaje != null) {
            mensaje.setNombre(nuevoContenido);
            System.out.println("Mensaje modificado: " + mensaje);
            return true;
        }
        System.out.println("Mensaje no encontrado para editar.");
        return false;
    }

}
