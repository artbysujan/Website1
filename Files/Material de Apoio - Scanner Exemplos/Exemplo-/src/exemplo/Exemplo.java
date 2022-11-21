/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo;

import java.util.Scanner;

/**
 *
 * @author rajendra pandit
 * 2N
 * 12
 */
public class Exemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int idada;
        System.out.println(" qual e sua idade ?");
        idada = entrada.nextInt();
        System.out.println(" A minha idade -> "+ idada);
    }
    
}
