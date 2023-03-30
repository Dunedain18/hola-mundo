/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjGuia4;

import java.util.Scanner;

/**
 *
 * @author matob
 */
public class ExtEj1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner (System.in);
       System.out.println("INGRESE EL TAMAÑO DEL VECTOR");
     int n = leer.nextInt();
     
       int [] vect = new int [n];
       
        for (int i = 0; i < n; i++) {
            System.out.println("INGRESE LOS VALORES PARA EL VECTOR");
vect[i]=leer.nextInt();//hasta aca se encuentran cargados los elementos//

        }
        int aux = 0;
        for (int i = 0; i < n; i++) {
            aux=aux+vect[i];//aux va a tener el valor de aux + vect pero en la posicion de i//
            
            
        }
            System.out.println("la suma de los valores ingresados es:  " + aux);  
    }
    
}
