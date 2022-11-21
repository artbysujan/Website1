/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarefa7;

import java.util.Scanner;

/**
 *
 * @author Rajendra pandit
 * 2N
 * 12
 */
public class Tarefa7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
        int a,i;
        System.out.println("Introduza um número:");
        a = entrada.nextInt();
        System.out.println();
        System.out.println("Incremento de "+a+":");
        System.out.println(a+1);
        System.out.println();
        System.out.println("Decremento de "+a+":");
        System.out.println(a-1);
        System.out.println();
        System.out.println("Números de 1 a 20:");
        for (i=1; i<=20; i=i+1)
        System.out.printf(i+" ");
        System.out.println();
        System.out.println("\nNúmeros de 20 a 0:");
        for (i=20; i>=0; i=i-1)    
        System.out.printf(i+" ");
        System.out.println();
        System.out.println("\nNúmeros de 100 a 300 de 100 em 100:");
        for (i=100; i<=300; i=i+100)   
        System.out.printf(i+" ");
        System.out.println();
    }
    
}
