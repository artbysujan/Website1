/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarefa5;

import java.util.Scanner;

/**
 *
 * @author  rajendra pandit
 * 2N
 * 12
*/
public class Tarefa5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner entrada = new Scanner (System.in);
        int a;
        
        System.out.printf("Porfavor introduza o peso em kg  :");
        a=entrada.nextInt();
        System.out.printf(" %d Kg == %d g \n",a,a*1000);
    }
    
}
