/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjGuia4;

/**
 *
 * @author matob
 */
public class Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[][] matrizA = new int[4][4];
        int[][] matrizB = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrizA[i][j] = (int) (Math.random() * 10);
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrizB[i][j] = matrizA[j][i];
            }
        }
        imprimirMatriz(matrizA);
        System.out.println("");
        System.out.println("");
        imprimirMatriz(matrizB);
    }

    public static void imprimirMatriz(int matriz[][]) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
