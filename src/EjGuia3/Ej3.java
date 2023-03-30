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
public class Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String mon;
        System.out.println("ingrese un monto en Euros: ");
        float monto = leer.nextFloat();
        do {
            System.out.println("que moneda es? (Dolar, Yenes o Libras)");
            mon = leer.next();
        } while (!mon.equalsIgnoreCase("dolar") && !mon.equalsIgnoreCase("yenes") & !mon.equalsIgnoreCase("libras"));
        cambio(monto, mon);
    }

    public static void cambio(float a, String s) {
        switch (s.toLowerCase()) {
            case "dolar":
                System.out.println("el cambio de " + a + " Euros a Dolares es " + (a * 1.28611));
                break;
            case "yenes":
                System.out.println("el cambio de " + a + " Euros a Yenes es " + (a * 129.852));
                break;
            case "libras":
                System.out.println("el cambio de " + a + " Euros a Libras es " + (a * 0.86));
                break;

        }
    }
}
