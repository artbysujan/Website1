/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarefa2;

import java.util.Scanner;

/**
 *
 * @author Rajendra pandit
 * 2N
 * 12
 */
public class Tarefa2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dataN, dataA;
        System.out.printf(" Porfavor introduza data atual : ");
        dataA = input.nextInt();
        System.out.printf(" Porfavor introduza data de nacimento :");
        dataN = input.nextInt();
        System.out.println("---------------------------------------------");
        System.out.printf(" Otimo, Voce tem %d Anos \n",dataA-dataN );
        System.out.println("---------------------------------------------");

    }
    
}
