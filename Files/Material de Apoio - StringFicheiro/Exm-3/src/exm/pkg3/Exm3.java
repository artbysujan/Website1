/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exm.pkg3;

/**
 *
 * @author rajendra pandit
 * 2N
 * 12
 */
public class Exm3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
       String valor = "rodrigo";
       valor = valor.replace("o", "*" );
       System.out.println(valor);
       
       /* Mais de Exemplo*/
       String psi = "PSI";
       System.out.println(psi);
       psi = psi.replace("P", "a");
       System.out.println(psi);
       
       String voli = "Portugal";
       System.out.println(voli);
       voli = voli.replace("P", "L");
       System.out.println(voli);
    }
    
}
