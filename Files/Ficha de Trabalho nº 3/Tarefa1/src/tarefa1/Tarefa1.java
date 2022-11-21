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
        int number1, number2;
        System.out.printf(" Porfavor  introduza 1º Número: ");
        number1 = input.nextInt();
        System.out.printf(" Porfavor introduza 2º Número: ");
        number2 = input.nextInt();
        System.out.printf(" %d + %d = %d \n",number1, number2, number1+number2);
        System.out.printf(" %d - %d = %d \n",number1, number2, number1-number2);
        System.out.printf(" %d x %d = %d \n",number1, number2, number1*number2);
        System.out.printf(" %d / %d = %d \n",number1, number2, number1/number2);

    }
    
}
