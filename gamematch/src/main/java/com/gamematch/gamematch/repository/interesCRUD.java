package com.gamematch.gamematch.repository;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.gamematch.gamematch.modelo.Interes;



@Repository
public class interesCRUD {


    ArrayList<Interes> intereses = new ArrayList<>();
    
    public void AgregarInteres(Interes i){
        intereses.add(i);
        System.out.println(i.toString());
    }

    public void EliminarInteres(Interes i){
        intereses.remove(i); 
        System.out.println("Interes eliminado: " + i.toString());
       
    }

    public void MostrarIntereses(){
        for (Interes i : intereses) {
            System.out.println(i.toString());
        }
    }

    public void EditarInteres(Interes i, String nuevoInteres){
        for (Interes interes : intereses) {
            if (interes.equals(i)) {
                interes.setNombreInteres(nuevoInteres);
                System.out.println("Interes modificado: " + interes.toString());
            }
        }
    }


}
