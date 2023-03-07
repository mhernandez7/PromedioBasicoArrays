/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplicationarraylist;

import java.util.ArrayList;

/**
 *
 * @author Miguel
 */
public class Promedio {
    
    ArrayList<Double>lista=new ArrayList<>();

    public Promedio() {
    }
    
   
    public ArrayList<Double> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Double> lista) {
        this.lista = lista;
    }
    
    public void validacion(ArrayList<Double> lista){
         double promT =0;
         double sumaT =0;
         
         for (int i =0; i<lista.size();i++){
                
                sumaT += lista.get(i);
         }
         promT = sumaT/lista.size();
         System.out.println("La suma de los promedios es: "+sumaT);
        System.out.println("El promedio de la nota es de: "+promT);
    }
    
    
}
