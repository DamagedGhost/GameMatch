package com.gamematch.gamematch.repository;

import java.util.ArrayList;

import com.gamematch.gamematch.modelo.Usuario;

public class UsuarioCRUD {
    // Esta clase es un CRUD (Create, Read, Update, Delete) para la entidad Usuario.

    // Se encarga de gestionar la lista de usuarios en memoria.
    ArrayList<Usuario> usuarios = new ArrayList<>();

    // Métodos CRUD para la entidad Usuario:

    // 1. Guardar un nuevo usuario en la lista.
    public void guardar(Usuario usuario) {
        usuarios.add(usuario);
    }

    // 2. Eliminar un usuario de la lista.
    public void eliminar(Usuario usuario) {
        usuarios.remove(usuario);
    }

    // 3. Modificar un usuario existente en la lista.
    public void modificar(Usuario usuario) {
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getId() == usuario.getId()) {
                usuarios.set(i, usuario);
                break;
            }
        }
    }

    // 4. Buscar un usuario por su ID en la lista.
    public Usuario buscarPorId(int id) {
        for (Usuario usuario : usuarios) {
            if (usuario.getId() == id) {
                return usuario;
            }
        }
        return null;
    }

    // 5. Listar todos los usuarios en la lista.
    public ArrayList<Usuario> listar() {
        return usuarios;
    }


}
