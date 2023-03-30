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
public class Ext6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese la cantidad de personas");
        int N = leer.nextInt(),men=0,cm =0,ct=0, c;
        for (int i = 0; i < N; i++) {
            System.out.println("ingrese la la altura de la " + (i+1) + " persona en cm");
            c = leer.nextInt();
            ct = ct + c;
            if (c<160) {
                cm = cm + c;
                men++;
            }
            
        }
        System.out.println("el promedio de altura de personas menores de 1.60 Mts es " + (cm/men));
        System.out.println("el promedio de altura total es " + (ct/N));
    }
    
}
