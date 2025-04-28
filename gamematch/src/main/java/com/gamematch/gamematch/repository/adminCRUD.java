package com.gamematch.gamematch.repository;

import java.util.ArrayList;
import com.gamematch.gamematch.modelo.Admin;

public class adminCRUD {
    // Esta clase es un CRUD (Create, Read, Update, Delete) para la entidad Admin.

    // Se encarga de gestionar la lista de administradores en memoria.
    ArrayList<Admin> admins = new ArrayList<>();
    
    // Métodos CRUD para la entidad Admin:
    public void guardar(Admin admin) {
        admins.add(admin);
    }

    // 2. Eliminar un administrador de la lista.
    public void eliminar(Admin admin) {
        admins.remove(admin);
    }

    // 3. Modificar un administrador existente en la lista.
    public void modificar(Admin admin) {
        for (int i = 0; i < admins.size(); i++) {
            if (admins.get(i).getId() == admin.getId()) {
                admins.set(i, admin);
                break;
            }
        }
    }

    // 4. Buscar un administrador por su ID en la lista.
    public Admin buscarPorId(int id) {
        for (Admin admin : admins) {
            if (admin.getId() == id) {
                return admin;
            }
        }
        return null;
    }

    // 5. Listar todos los administradores en la lista.
    public ArrayList<Admin> listar() {
        return admins;
    }


    // comentario de prueba para ver si se sube el archivo

}
