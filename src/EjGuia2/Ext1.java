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
public class Ext1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese los minutos");
        int num = leer.nextInt();
        int min = num%60;
        num= num/60;
        int hor = num%24;
        num= num/24;
        System.out.println("el equivalente es " + num + " dias, " + hor + " Horas y " + min + " Minutos");
    }
    
}
