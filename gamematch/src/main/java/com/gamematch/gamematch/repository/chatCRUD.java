package com.gamematch.gamematch.repository;
import java.util.ArrayList;

import com.gamematch.gamematch.modelo.Chat;

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

}
