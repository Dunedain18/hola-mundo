/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjGuia3;

import java.util.Scanner;

/**
 *
 * @author matob
 */
public class Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un numero");
        int a = leer.nextInt();
        System.out.println("ingrese un numero");
        int b = leer.nextInt();
        System.out.println("MENU \n"
                + "1 - Sumar \n"
                + "2 - Restar \n"
                + "3 - Multiplicar \n"
                + "4 - Dividir \n"
                + " ");
        int op = leer.nextInt();
        System.out.println(" \n"
                + "el resultado es "
                + operacion(a, b, op));
    }

    public static float operacion(int a, int b, int op) {
        float r;
        switch (op) {
            case 1:
                return a + b;
            case 2:
                return a - b;
            case 3:
                return a * b;
            case 4:
                return a / b;

            default:
                throw new AssertionError();
        }
    }
}
