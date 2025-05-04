package com.gamematch.gamematch.repository;
import java.util.ArrayList;
import java.util.List;

import com.gamematch.gamematch.modelo.Chat;

public class chatCRUD {
ArrayList<Chat> chats = new ArrayList<>();

    public void agregarChat(Chat chat) {
        chats.add(chat);
        System.out.println("Chat agregado: " + chat);
    }
    
    public boolean eliminarChat(String id) {
        Chat chat = buscarPorId(id);
        if (chat != null) {
            chats.remove(chat);
            System.out.println("Chat eliminado: " + chat);
            return true;
        }
        System.out.println("Chat no encontrado para eliminar.");
        return false;
    }  

        public List<Chat> listarChats() {
            return new ArrayList<>(chats);
        }

        public Chat buscarPorId(String id) {
            for (Chat chat : chats) {
                if (chat.getIdChat().equals(id)) {
                    return chat;
                }
            }
            return null;
        }

        public boolean editarChat(String id, String nuevoContenido) {
            Chat chat = buscarPorId(id);
            if (chat != null) {
                chat.setIdChat(nuevoContenido); // Asumiendo que quieres cambiar el ID (no recomendable)
                System.out.println("Chat modificado: " + chat);
                return true;
            }
            System.out.println("Chat no encontrado para editar.");
            return false;
        }
}
