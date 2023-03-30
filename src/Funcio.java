/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author matob
 */
public class Funcio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
   
    public static void LlenaVector(int vec[]){
        for (int i = 0; i < vec.length ; i++) {
            vec[i] = (int)(Math.random()*100);
            
        }
    }

    public static void ImprimirVector(int vec[]) {
        for (int i = 0; i < vec.length ; i++) {
            System.out.println(" "+vec[i]);
        }
    }
   
    public static int fibonacci(int n) {
        if (n <= 2) {
            return 1;
        }else{
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }

        public static void CompararVectores(int x[], int y[]) {
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

    public static void RellenarMatriz(String vec[][], int x, String cad) {
        int pos;
        pos = (int) (Math.random() * ((vec.length) - (cad.length())));
        for (int i = pos; i < (pos + cad.length()); i++) {
            vec[x][i] = cad.substring(i-pos, i + 1-pos);
        }
    }

    public static void ImprimirMatriz(String vec[][]) {
        for (int i = 0; i < vec[0].length; i++) {
            for (int j = 0; j < vec[0].length; j++) {
                System.out.print(" " + vec[i][j]);
            }
            System.out.println("");
        }
    }
}
