/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarefa1;

import java.util.Scanner;


/**
 *
 * @author Rajendra pandit
 * 2N
 * 12
 */
public class Tarefa1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int entrada1, entrada2;
       System.out.printf(" Please enter the  first number :");
       entrada1 = input.nextInt();
       System.out.printf(" Please entre the  Second number :");
       entrada2 = input.nextInt();
       System.out.println(" The sum of the two numbers are : "+(entrada1+entrada2)); 
       System.out.println(" The multiplication of the two numbers  are :"+(entrada1*entrada2));
       System.out.println(" The Substraction of the two numbers are: "+(entrada1+entrada2));
       System.out.println(" The Division to the two numbers are: "+ entrada1 / entrada2);
       
    }
    
}
