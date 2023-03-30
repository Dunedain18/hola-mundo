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
public class Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String fra;
       do{
        System.out.println("ingrese una frase");
        fra = leer.nextLine();
        if (fra.length()==8) {
            System.out.println("Correcto");
           
        }else{
            System.out.println("Incorrecto");
        }
       }while(fra.length()!=8);
    }
    
}
