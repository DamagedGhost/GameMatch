package com.gamematch.gamematch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.gamematch.gamematch.modelo.Usuario;
import com.gamematch.gamematch.repository.UsuarioCRUD;

import java.util.List;


public class usuarioController {

    // Esta clase es un controlador REST para gestionar usuarios.
    // Se encarga de recibir las solicitudes HTTP y delegar la lógica de negocio al servicio correspondiente.
    // La anotación @RestController indica que esta clase es un controlador REST.
    @Autowired
    private UsuarioCRUD usuarioService;// Asegúrate de que Userservice esté definido y anotado correctamente


    // Método para buscar un usuario por su ID
    // Se espera que el ID del usuario se pase como un parámetro de ruta en la URL.
    // Por ejemplo: GET /usuarios/1
    @GetMapping
    public List<Usuario> listar() {
        return usuarioService.listar(); // Asegúrate de que getAllUsers() esté definido en tu servicio
    }


    // Método para guardar un nuevo usuario
    // Se espera que el cuerpo de la solicitud contenga un objeto Usuario en formato JSON
    // y se asigna a la variable usuario.
    @PostMapping
    public void guardar(@RequestBody Usuario usuario) {
        usuarioService.guardar(usuario); // Asegúrate de que saveUser() esté definido en tu servicio
        System.out.println("Usuario guardado: " + usuario.getNomUsuario());
    }
    

}
