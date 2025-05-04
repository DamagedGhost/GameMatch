package com.gamematch.gamematch.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gamematch.gamematch.modelo.Usuario;
import com.gamematch.gamematch.repository.UsuarioCRUD;

@Service
public class usuarioService {
    @Autowired
    // Esta clase es un servicio que se encarga de la lógica de negocio relacionada con los usuarios.
    // Se espera que contenga métodos para gestionar usuarios, como guardar, modificar, eliminar y buscar usuarios.
    // La implementación de estos métodos dependerá de la lógica específica de tu aplicación y del acceso a datos que estés utilizando.
    // Por ejemplo, podrías usar un repositorio para acceder a una base de datos o una lista en memoria para almacenar los usuarios temporalmente.

    // Aquí puedes definir los métodos necesarios para gestionar usuarios.
    // Por ejemplo:
    // public void guardar(Usuario usuario) { ... }
    // public void modificar(Usuario usuario) { ... }
    // public void eliminar(Usuario usuario) { ... }
    // public Usuario buscarPorId(int id) { ... }

    private UsuarioCRUD usuarioCRUD = new UsuarioCRUD();

    public void guardar(Usuario usuario) {
        usuarioCRUD.guardar(usuario);
    }
    public void eliminar(Usuario usuario) {
        usuarioCRUD.eliminar(usuario);
    }
    public Usuario buscarPorId(int id) {
        return usuarioCRUD.buscarPorId(id);
    }
    public void modificar(Usuario usuario) {
        usuarioCRUD.modificar(usuario);
    }
    public List<Usuario> listar() {
        return usuarioCRUD.listar();
    }



}
