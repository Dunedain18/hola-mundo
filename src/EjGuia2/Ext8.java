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
public class Ext8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int tot = 0, par = 0, impar = 0, num;
        do {            
            System.out.println("ingrese un numero");
            num = leer.nextInt();
            tot++;
            if (num%2 == 0) {
                par++;
            }else{
                impar++;
            }
        } while (num%5 != 0);
        System.out.println("la cantidad de numeros leidos son " + tot);
        System.out.println("la cantidad de numeros impares son " + impar);
        System.out.println("la cantidad de numeros pares son " + par);
    }
    
}
