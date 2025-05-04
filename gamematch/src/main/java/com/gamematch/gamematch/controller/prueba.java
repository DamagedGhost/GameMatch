package com.gamematch.gamematch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.gamematch.gamematch.modelo.Usuario;
import com.gamematch.gamematch.repository.UsuarioCRUD;

import java.util.List;


public class prueba {
    //prueba

    @Autowired
    private UsuarioCRUD usuarioService;// Asegúrate de que Userservice esté definido y anotado correctamente

    @GetMapping
    public List<Usuario> listar() {
        return usuarioService.listar(); // Asegúrate de que getAllUsers() esté definido en tu servicio
    }

    @PostMapping
    public UsuarioCRUD guardar(@RequestBody UsuarioCRUD usuario) {
        return usuarioService.guardar(usuario);
    }
    

}
