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
public class Guiaej7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("ingrese el tipo de motor 1 - 4");
       int tipoMotor = leer.nextInt();
        switch (tipoMotor) {
            case 1 :
                System.out.println("La bomba es una bomba de agua");
                break;
            case 2 :
                System.out.println("La bomba es una bomba de gasolina");
                break;
            case 3 :
                System.out.println("La bomba es una bomba de hormigon");
                break;
            case 4 :
                System.out.println("La bomba es una bomba de pasta alimenticia");
                break;
            default:
                System.out.println("No existe un valor valido para tipo de bomba");
        }
        
    }
    
}
