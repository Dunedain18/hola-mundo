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
public class Ej8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese la base");
        int bas = leer.nextInt();
        System.out.println("ingrese la altura");
        int alt = leer.nextInt();
        for (int i = 0; i < alt; i++) {
            for (int j = 0; j < bas; j++) {
                if (i == 0 || i == alt - 1 || j == 0 || j == bas - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println("");
        }
    }

}
