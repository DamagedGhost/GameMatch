package com.gamematch.gamematch.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gamematch.gamematch.modelo.Usuario;
import com.gamematch.gamematch.service.usuarioService;

@RestController
@RequestMapping("/usuarios")
public class usuarioController {

    @Autowired
    private usuarioService Service;

    @GetMapping("/listar")
    public List<Usuario> listarUsuarios() {
        return Service.listar();
    }
    

}
