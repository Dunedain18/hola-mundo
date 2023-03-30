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
public class Dia1Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un numero entero");
        int num = leer.nextInt();
        System.out.println("el doble del numero es " + (num*2));
        System.out.println("el triple del numero es " + (num*3));
        System.out.println("la raiz cuadrada del numero es " + Math.sqrt(num));
    }
    
}
