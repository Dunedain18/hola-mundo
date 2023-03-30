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
public class GuiaEj11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese una frase");
        String fra = leer.nextLine(), r;
        r = cambio(fra);
        System.out.println(r);

    }

    public static String cambio(String fr) {
        int x = fr.length();
        String ret = "";
        for (int i = 0; i < x; i++) {

            switch (fr.substring(i, i + 1).toLowerCase()) {
                case "a":
                    ret = ret.concat("@");
                    break;
                case "e":
                    ret = ret.concat("#");
                    break;
                case "i":
                    ret = ret.concat("$");
                    break;
                case "o":
                    ret = ret.concat("%");
                    break;
                case "u":
                    ret = ret.concat("*");
                    break;
                default:
                    ret = ret.concat(fr.substring(i, i + 1));
            }

        }
        return ret;
    }

}
