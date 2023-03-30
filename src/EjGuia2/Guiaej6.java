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
public class Guiaej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese 1 numero");
        int num1 = leer.nextInt();
        System.out.println("ingrese un numero");
        int num2 = leer.nextInt();
        if (num1>25){
          if (num2>25){
              System.out.println("los dos numeros son mayores de 25");
          }else{
              System.out.println("el primer numero es mayor de 25");
             
          }
          
        }else if(num2>25){
            System.out.println("el segundo numero es mayor de 25");
        }
    }
    
}
