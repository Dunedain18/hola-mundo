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
public class Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un numero");
        int num = leer.nextInt();
        if (primo(num)) {
            System.out.println("es primo");
        } else {
            System.out.println("no es primo");
        }
    }

    public static boolean primo(int a) {
        int c = 0;
        for (int i = 0; i < a; i++) {
            if (a % (i + 1) == 0) {
                c++;
            }
        }
        if (c > 2) {
            return false;
        } else {
            return true;
        }
    }
}
