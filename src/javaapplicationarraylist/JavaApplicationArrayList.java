/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplicationarraylist;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class JavaApplicationArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read = new Scanner(System.in);
        int validacion =0;
        double promedio =0;
        ArrayList<Double>lista=new ArrayList<>();
        do{
            System.out.println("Introduzca un promedio");
            promedio = read.nextDouble();
            lista.add(promedio);
            System.out.println("para ingresar otro promedio presione cualquier numero");
            System.out.println("para salir presione 2)");
            validacion = read.nextInt();
        }while(validacion != 2);
        
        Promedio promedi = new Promedio();
        promedi.setLista(lista);
        promedi.validacion(lista);
        
    }
    
}
