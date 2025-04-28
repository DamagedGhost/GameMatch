package com.gamematch.gamematch.repository;
import com.gamematch.gamematch.modelo.Mensaje;
import java.util.ArrayList;


public class mensajeCRUD {
    ArrayList<Mensaje> mensajes = new ArrayList<>();
    
    public void AgregarMensaje(Mensaje m){
        mensajes.add(m);
        System.out.println(m.toString());
    }

    public void EliminarMensaje(Mensaje m){
        mensajes.remove(m); 
        System.out.println("Mensaje eliminado: " + m.toString());
       
    }

    public void MostrarMensajes(){
        for (Mensaje m : mensajes) {
            System.out.println(m.toString());
        }
    }

    public void EditarMensaje(Mensaje m, String nuevoContenido){
        for (Mensaje mensaje : mensajes) {
            if (mensaje.equals(m)) {
                mensaje.setNombre(nuevoContenido);
                System.out.println("Mensaje modificado: " + mensaje.toString());
            }
        }
    }

}
