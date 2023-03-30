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
public class ExtEj7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese la posicion en fibonacci");
        int num = leer.nextInt();
        System.out.println("el numero en la posicion "+ num + " es " + fibonacci(num));
    }
    
    public static int fibonacci(int n) {
        if (n <= 2) {
            return 1;
        }else{
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
    
}
//1 - 1 - 2 - 3 - 5 - 8 - 13 - 21 - 34