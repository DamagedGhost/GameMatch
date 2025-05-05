package com.gamematch.gamematch.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import com.gamematch.gamematch.modelo.Mensaje;
import com.gamematch.gamematch.service.MensajeService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/mensajes")
public class MensajeController {
    
    private final MensajeService mensajeService = new MensajeService();

    @GetMapping
    public List<Mensaje> listarMensajes() {
        return mensajeService.listarMensajes();
    }

    @GetMapping("/{id}")
    public Mensaje obtenerMensaje(@PathVariable String id) {
        return mensajeService.obtenerMensajePorId(id);
    }

    @PostMapping
    public void agregarMensaje(@RequestBody Mensaje mensaje) {
        mensajeService.agregarMensaje(mensaje);
    }

    @PutMapping("/{id}")
    public void editarMensaje(@PathVariable String id, @RequestBody String nuevoContenido) {
        mensajeService.editarMensaje(id, nuevoContenido);
    }
    
    @DeleteMapping("/{id}")
    public void eliminarMensaje(@PathVariable String id) {
        mensajeService.eliminarMensaje(id);
    }
}
