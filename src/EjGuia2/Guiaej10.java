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
public class Guiaej10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        for (int i = 0; i < 4; i++) {
            System.out.print("ingrese el " + (i+1) + " numero ");
            num = leer.nextInt();
            System.out.print(num + " ");
            for (int j = 0; j < num; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
}
