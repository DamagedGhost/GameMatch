package com.gamematch.gamematch.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gamematch.gamematch.modelo.Chat;
import com.gamematch.gamematch.repository.chatCRUD;
import java.util.List;

@Service
public class ChatService {
    @Autowired
    private chatCRUD chatCRUD = new chatCRUD();

    public void agregarChat(Chat chat) {
        chatCRUD.agregarChat(chat);
    }

    public boolean eliminarChat(String id) {
        return chatCRUD.eliminarChat(id);
    }

    public List<Chat> listarChats() {
        return chatCRUD.listarChats();
    }

    public Chat obtenerChatPorId(String id) {
        return chatCRUD.buscarPorId(id);
    }
    public boolean editarChat(String id, String nuevoContenido) {
        return chatCRUD.editarChat(id, nuevoContenido);
    }
}
