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
public class Ej5 {

    /**
     * @param args the command line arguments
     */
  public static void main(String[] args) {
        int matriz1 [][] = new int [3][3];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz1 [i][j]= (int) (Math.random()*10);
                System.out.print(matriz1 [i] [j]+" ");
            }
            System.out.println("");
        }
 int matriz2 [][] = new int [3][3];
        System.out.println(" ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz2[i][j]=matriz1 [j][i];
                System.out.print(matriz2 [i][j]+" ");
            }
            System.out.println("");
            
            
        }boolean x = false;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz1 [i][j]==-matriz2 [i][j])
                    x=true;
                
            }
        }if (x==true) System.out.println("LA MATRIZ SON ANTISIMETRICA");
        else System.out.println("NO SON ANTISIMETRICA");
    }
    
}
    
