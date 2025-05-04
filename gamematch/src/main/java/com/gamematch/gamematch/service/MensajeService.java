package com.gamematch.gamematch.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gamematch.gamematch.modelo.Mensaje;
import com.gamematch.gamematch.repository.mensajeCRUD;

import java.util.List;

@Service
public class MensajeService {
    @Autowired

    private mensajeCRUD mensajeCRUD = new mensajeCRUD();

    public void agregarMensaje(Mensaje mensaje) {
        mensajeCRUD.AgregarMensaje(mensaje);
    }

   
    public boolean eliminarMensaje(String id) {
        return mensajeCRUD.eliminarMensaje(id);
    }

    
    public List<Mensaje> listarMensajes() {
        return mensajeCRUD.MostrarMensajes();
    }

    
    public Mensaje obtenerMensajePorId(String id) {
        return mensajeCRUD.buscarPorId(id);
    }

    
    public boolean editarMensaje(String id, String nuevoContenido) {
        return mensajeCRUD.editarMensaje(id, nuevoContenido);
    }
}
