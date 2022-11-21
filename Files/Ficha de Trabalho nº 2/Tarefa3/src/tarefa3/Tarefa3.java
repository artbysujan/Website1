/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarefa3;

import java.util.Scanner;

/**
 *
 * @author Artbysujan
 */
public class Tarefa3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner entrada = new Scanner(System.in);
     int number1, number2, number3;
     System.out.printf(" Please Enter the 1st marks :");
     number1 = entrada.nextInt();
     System.out.printf(" Please Enter the 2nd marks :");
     number2 = entrada.nextInt();
     System.out.printf(" Please Enter the 3rd marks :");
     number3 = entrada.nextInt();
     int soma  = number1+number2+number3;
     System.out.println(" média final = "+ soma / 3);
    }
    
}
