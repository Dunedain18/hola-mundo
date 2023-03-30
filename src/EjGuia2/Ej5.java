/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjGuia2;

import java.util.Scanner;

/**
 *
 * @author matob
 */
public class Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un valor limite");
        int lim = leer.nextInt();
        int num = 0;
        do {            
            System.out.println("ingrese un numero");
            num = num + leer.nextInt();
        } while (num<lim);
        System.out.println("la suma de los numeros es " + num);
    }
    
}
