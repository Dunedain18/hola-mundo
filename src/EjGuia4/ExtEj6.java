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
public class ExtEj6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String[][] sopa = new String[20][20];
        int[] pos = new int[5];
        int lu;
        String pal;
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                sopa[i][j] = Integer.toString((int) (Math.random() * 10));
            }
        }
        posicion(pos);
        for (int i = 0; i < 5; i++) {
            do{
            System.out.println("ingrese la "+(i+1)+"° palabra de 3 a 5 caracteres");
            pal = leer.next();
            }while(pal.length()>5 || pal.length()<3);
            Rellenar(sopa, pos[i], pal);
        }
        ImprimirVector(sopa);

    }

    public static void posicion(int x[]) {
        int h, aux;
        for (int i = 0; i < x.length; i++) {
            x[i] = 0;
            do {
                h = 0;
                aux = (int) (Math.random() * 20);
                for (int j = 0; j < x.length; j++) {
                    if (aux == x[j] && i > 0) {
                        h++;
                    }
                }
            } while (h != 0);
            x[i] = aux;
        }
    }

    public static void Rellenar(String vec[][], int x, String cad) {
        int pos;
        pos = (int) (Math.random() * ((vec.length) - (cad.length())));
        for (int i = pos; i < (pos + cad.length()); i++) {
            vec[x][i] = cad.substring(i-pos, i + 1-pos);
        }
    }

    public static void ImprimirVector(String vec[][]) {
        for (int i = 0; i < vec[0].length; i++) {
            for (int j = 0; j < vec[0].length; j++) {
                System.out.print(" " + vec[i][j]);
            }
            System.out.println("");
        }
    }

}
