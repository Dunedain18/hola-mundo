package EjGuia2;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author matob
 */
public class Ext9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el numero a dividir");
        int num = leer.nextInt();
        System.out.println("ingrese el divisor");
        int div = leer.nextInt();
        int cos = 0;
        do {            
            num = num-div;
            cos++;
        } while (num>div);
        System.out.println("el cociente es "+ cos + " el residuo es " + num);
    }
    
}
