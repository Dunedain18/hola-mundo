/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjGuia4;

/**
 *
 * @author matob
 */
public class ExtEj3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] ve = new int[8];
        LlenaVector(ve);
        ImprimirVector(ve);
        
    }
    
    public static void LlenaVector(int vec[]){
        for (int i = 0; i < vec.length ; i++) {
            vec[i] = (int)(Math.random()*100);
            
        }
    }

    public static void ImprimirVector(int vec[]) {
        for (int i = 0; i < vec.length ; i++) {
            System.out.println(" "+vec[i]);
        }
    }
    
}
