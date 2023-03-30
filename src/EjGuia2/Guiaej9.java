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
public class Guiaej9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        int c= 0;
        int sum = 0;
        do {    
            c++;        
            System.out.println("ingrese el " + c + " numero");
            num = leer.nextInt();
            if (num>0) {
                sum = sum + num;
            }else if (num==0){
                System.out.println("se capturo un 0");
                break;
            }
            
        } while (c<20);
        System.out.println("la suma de los numeros es " + sum);
    }
    
}
