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
public class ExtEj2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vec1 = {5, 8, 9, 6, 4, 7, 15};
        int[] vec2 = {5, 8, 7, 6, 4, 7, 15};
        CompararVectores(vec1, vec2);
    }

    private static void CompararVectores(int x[], int y[]) {
        int i = -1;
        do {
            i++;
            if (x[i] != y[i]) {
                System.out.println("los vectores son distintos");
            }
        } while (x[i] == y[i] && i < x.length-1);
        if (i==x.length-1) {
            System.out.println("los vectores son iguales");
        }
    }

}
