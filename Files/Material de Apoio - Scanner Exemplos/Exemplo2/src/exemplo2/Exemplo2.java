    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo2;

import java.util.Scanner;

/**
 *
 * @author Rajendra pandit
 * 2N
 * 12
 */
public class Exemplo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
       float intrada1, intrada2;
       System.out.printf(" Please enter the First number decimal :");
       intrada1 = input.nextFloat();
       System.out.printf(" Please enter the second number decimal :");
       intrada2 = input.nextFloat();
       System.out.println(" A soma dos duas number são =  "+(intrada1 + intrada2));
       
    }
    
}
