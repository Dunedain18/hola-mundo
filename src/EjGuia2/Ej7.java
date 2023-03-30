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
public class Ej7 {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
       String cad;
       int inc = 0, cor= 0;
        do {            
            System.out.println("ingrese la cadena a leer");
            cad = leer.nextLine();
            if (cad.length()==5 && cad.substring(0,1).equals("X") && cad.substring(4,5).equals("O") ) {
                cor++;
            }else if(!cad.equals("&&&&&")){
                inc++;
            }
        } while (!cad.equals("&&&&&"));
        System.out.println("Cadenas Correctas " + cor);
        System.out.println("Cadenas incorrectas" + inc);
    }
    
}
