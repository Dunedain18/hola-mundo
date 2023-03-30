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
public class Ej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese la dimension del cuadrado");
        int d= leer.nextInt();
        int[][] cuad = new int[d][d];
        int diag = 0, aux1, aux2, col = 0, fil = 0;
        System.out.println("ingrese los valores del cuadrado");
        for (int i = 0; i < d; i++) {
            for (int j = 0; j < d; j++) {
                cuad[i][j] = leer.nextInt();
            }
        }
        for (int i = 0; i < d; i++) {
            diag += cuad[i][i]; //diag = diag + cuad[i][i];
        }
        for(int i =0 ; i<d;i++){
            aux1 = 0;
            aux2 = 0;
            for (int j = 0; j < d; j++) {
                aux1 += cuad[i][j];
                aux2 += cuad[j][i];
            }
            if (aux1 == diag) {
                col++;
            }
            if (aux2 == diag) {
                fil++;
            }
        }
        if (fil == d && col == d) {
            System.out.println("el cubo es magico");
        } else {
            System.out.println("el cubo no es magico");

        }

    }

}
