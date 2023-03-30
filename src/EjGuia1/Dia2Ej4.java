/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjGuia1;

import java.util.Scanner;

/**
 *
 * @author matob
 */
public class Dia2Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.println("ingrese la temperatura en C°");
        float temp = leer.nextFloat();
        System.out.println("la temperatura en Fahrenheit es " + (32+(9*temp/5)));
             
             
    }
    
}
