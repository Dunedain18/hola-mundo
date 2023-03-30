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
public class Ext10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1 = (int)(Math.random()*10),num2 = (int)(Math.random()*10), m;
        System.out.println(num1*num2);
        do {            
            System.out.println("adivine el numero");
            m = leer.nextInt();
            if (m != (num1*num2)) {
                System.out.println("NO, NO, NO, el numero es incorrecto \n"
                        + "Prueba otra vez!!!");
            }
        } while (m != (num1*num2));
        
    }
    
}
