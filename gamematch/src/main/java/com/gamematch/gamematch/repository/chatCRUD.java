package com.gamematch.gamematch.repository;
import java.util.ArrayList;

import com.gamematch.gamematch.controller.Chat;



public class chatCRUD {
ArrayList<Chat> chats = new ArrayList<>();

        public void AgregarChat(Chat ch){
            chats.add(ch);
            System.out.println(ch.toString());
        }
    
        public void EliminarChat(Chat ch){
            chats.remove(ch); 
            System.out.println("Chat eliminado: " + ch.toString());
            
        }   

        public void MostrarChats(){
            for (Chat ch : chats) {
                System.out.println(ch.toString());
            }
        }

        public void EditarChat(Chat ch, String nuevoContenido){
            for (Chat chat : chats) {
                if (chat.equals(ch)) {
                    chat.setIdChat(nuevoContenido);
                    System.out.println("Chat modificado: " + chat.toString());
                }
            }
        }
}
