// ================================
// Created by: DamagedGhost
// ================================

package com.gamematch.gamematch.repository;

// importar las librerías necesarias: arraylist y la clase Admin.
import java.util.ArrayList;

import com.gamematch.gamematch.modelo.Admin;

// Esta clase es un CRUD (Create, Read, Update, Delete) para la entidad Admin.
public class adminCRUD {

    // Se encarga de gestionar la lista de administradores en memoria.
    ArrayList<Admin> admins = new ArrayList<>();
    
    // 1. Guardar un nuevo administrador en la lista.
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