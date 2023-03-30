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
public class Ext4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        do {
            System.out.println("ingresar un numero entre 1 y 10");

            num = leer.nextInt();
        } while (num > 10 || num < 0);
        if (num < 4) {
            for (int i = 0; i < num; i++) {
                System.out.print("I");
            }
        } else if (num == 4 || num ==9) {
            System.out.print("I");
        }
        if (num > 3 && num < 9) {
            System.out.print("V");
            if (num > 5 && num<9) {
                for (int i = 5; i < num; i++) {
                    
                
                System.out.print("I");
            }
            }
        } else if(num>8) {
            System.out.print("X");
        }
        System.out.println(" ");
    }

}
