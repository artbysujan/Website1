/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarefa2;

import java.util.Scanner;

/**
 *
 * @author Rajendra Pandit
 * 2N
 * 12
 */
public class Tarefa2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
       int dataN, dataH;
       System.out.printf(" Porfavor introduza a Ano nos estamos :");
       dataN = input.nextInt();
       System.out.printf(" Porfavor innroduza a Ano do nacimento : ");
       dataH = input.nextInt();
       System.out.println(" A sua idade é "+ (dataH - dataN));
    }
    
}
