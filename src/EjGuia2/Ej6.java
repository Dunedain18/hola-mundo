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
public class Ej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el primer numero");
        int num1 = leer.nextInt();
        System.out.println("ingresed el segundo numero");
        int num2 = leer.nextInt();
        int op;
        String fin;
        do {
          /*  System.out.println("MENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Elija opcion");*/
            System.out.println("menu \n"
                    + "1 \n"
                    + "2 \n");
            op = leer.nextInt();
            switch (op) {
                case 1:
                    System.out.println("la Suma de " + num1 + " + " + num2 + " es " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("la Resta de " + num1 + " - " + num2 + " es " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("la Multiplicacion de " + num1 + " x " + num2 + " es " + (num1 * num2));
                    break;
                case 4:
                    System.out.println("la Division de " + num1 + " % " + num2 + " es " + (num1 / num2));
                    break;
                case 5:
                    
                        System.out.println("¿esta seguro que desea salir del programa?(S/N)");
                        fin = leer.next();
                        if (fin.equalsIgnoreCase("N")) {
                            op = 2;
                        }
                    
                    break;
                default:
                    System.out.println("Opcion Erronea");
            }

        } while (op != 5);

    }

}
