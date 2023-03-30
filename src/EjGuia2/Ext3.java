package EjGuia2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author matob
 */
public class Ext3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese una letra");
        String let = leer.next();
        if (let.equalsIgnoreCase("a")||let.equalsIgnoreCase("e")||let.equalsIgnoreCase("i")||let.equalsIgnoreCase("o")||let.equalsIgnoreCase("u")) {
            System.out.println("es una vocal");   
        }else{
            System.out.println("no es una vocal");
        }
        
    }
    
}
