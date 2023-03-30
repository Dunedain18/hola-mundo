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
public class Ext12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int h=10;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < h; j++) {
                for (int k = 0; k < h; k++) {
                    if (i==3) {
                        System.out.print("E-");                        
                    }else{
                        System.out.print(i+"-");
                    }
                     if (j==3) {
                        System.out.print("E-");                        
                    }else{
                        System.out.print(j+"-");
                    } if (k==3) {
                        System.out.print("E");                        
                    }else{
                        System.out.print(k);
                    }
                    System.out.println("");
                }
                
            }
            
        }
    }
    
}
