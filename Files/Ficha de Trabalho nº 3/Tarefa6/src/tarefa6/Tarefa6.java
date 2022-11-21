/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarefa6;

import java.util.Scanner;

/**
 *
 * @author Rajendra pandit
 */
public class Tarefa6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner input = new Scanner (System.in);
      float valor;
      System.out.printf(" Porfavor introduza o volor de Tempratura em Fº :");
      valor = input.nextFloat();
      System.out.printf(" O resultado e %.2f ºC\n",(valor -32)*5/9);
    }
    
}
