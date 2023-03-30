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
public class GuiaEj12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un numero");
        int num1 = leer.nextInt();
        System.out.println("ingrese un numero");
        int num2 = leer.nextInt();
        EsMultiplo(num1,num2);

    }

    public static void EsMultiplo(int n1, int n2) {
        if (n1 % n2 == 0) {
            System.out.println("el numero " + n1 + " es multiplo de " + n2);

        } else {
            System.out.println("el numero " + n1 + " no es multiplo de " + n2);

        }
    }
}
