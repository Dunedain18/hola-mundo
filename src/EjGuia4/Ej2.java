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
public class Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el tamaño del vector");
        int tam = leer.nextInt(), pos = 0, x = 0, h;
        int[] vect = new int[tam];
        for (int i = 0; i < tam; i++) { vect[i] = (int) (Math.random() * 10); }
        do {
            h = 0;
            System.out.println("ingrese un numero");
            int us = leer.nextInt();
            for (int i : vect) {
                if (i == us) {
                    pos = x;
                    h++;
                }
                x++;
            }
            if (h == 0) { System.out.println("error \n" + "intente nuevamente"); }
        } while (h < 1);
        System.out.println("la posision del numero es " + (pos + 1));
    }
}
