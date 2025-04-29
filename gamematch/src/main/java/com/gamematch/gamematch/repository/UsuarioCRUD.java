// ================================
// Created by: DamagedGhost
// ================================

package com.gamematch.gamematch.repository;

// importaciones necesarias: ArrayList y la clase Usuario.
import java.util.ArrayList;
import com.gamematch.gamematch.modelo.Usuario;

    // Esta clase es un CRUD (Create, Read, Update, Delete) para la entidad Usuario.
public class UsuarioCRUD {

    // Se encarga de gestionar la lista de usuarios en memoria.
    ArrayList<Usuario> usuarios = new ArrayList<>();

    // 1. Guardar un nuevo usuario en la lista.
    public void guardar(Usuario usuario) {
        usuarios.add(usuario);
        System.out.println("Usuario guardado: " + usuario.getNomUsuario());
    }

    // 2. Eliminar un usuario de la lista.
    public void eliminar(Usuario usuario) {
        usuarios.remove(usuario);
        System.out.println("Usuario eliminado: " + usuario.getNomUsuario());
    }

    // 3. Modificar un usuario existente en la lista.
    public void modificar(Usuario usuario) {
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getId() == usuario.getId()) {
                usuarios.set(i, usuario);
                break;
            }
        }
        System.out.println("Usuario modificado: " + usuario.toString());
    }

    // 4. Buscar un usuario por su ID en la lista.
    public Usuario buscarPorId(int id) {
        for (Usuario usuario : usuarios) {
            if (usuario.getId() == id) {
                return usuario;
            }
        }
        System.out.println("Usuario no encontrado con ID: " + id);
        return null;
    }

    // 5. Listar todos los usuarios en la lista.
    public ArrayList<Usuario> listar() {
        return usuarios;
    }


}

// ─────────────────────────────────────────────────────────────
// ░▒▓█► END OF CODE ◄█▓▒░
//   ♪ 'Cause everyone's too scared to heal ♪
//   ♪ They don't give a fuck how they feel ♪
//   ♪ And I just don't know how to deal anymore ♪
// ─────────────────────────────────────────────────────────────
//   🕶️  SYSTEM LOG // CLOSING BUILD_01: [INJECT LUDENS]
//   ☠️  “God is a programmer. But the ghost writes in root.”
//   📟  Terminal signed off — DamagedGhost.exe
// ─────────────────────────────────────────────────────────────