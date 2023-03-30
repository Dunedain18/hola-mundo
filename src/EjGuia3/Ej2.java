/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjGuia3;

import java.util.Scanner;

/**
 *
 * @author matob
 */
public class Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String op = "s";
    
        int edad;
        while (!op.equalsIgnoreCase("no")){
            System.out.println("ingrese El nombre de la persona");
            String nom = leer.nextLine();            
            System.out.println("ingrese la edad de la persona");
            edad = leer.nextInt();
            may(nom, edad);
            do {
                System.out.println("Desea continuar? (SI/NO)");
                op = leer.next();
            }while(!op.equalsIgnoreCase("no") && !op.equalsIgnoreCase("si"));
            leer.nextLine();
        }  
    }

    public static void may(String a, int e) {
        System.out.print("\n" + "\n" + "El nombre de la persona es ");
        for (int i = 0; i < a.length(); i++) {
            if (i == 0 || a.substring(i - 1, i).equals(" ")) {
                System.out.print(a.substring(i, i + 1).toUpperCase());
            } else {
                System.out.print(a.substring(i, i + 1).toLowerCase());
            }
        }
        if (e > 17) {
            System.out.println(" y es mayor de edad");
        } else {
            System.out.println(" y es menor de edad");
        }
    }
}
