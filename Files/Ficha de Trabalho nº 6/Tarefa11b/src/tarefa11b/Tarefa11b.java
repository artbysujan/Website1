/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarefa11b;

/**
 *
 * @author Rajendra pandit
 * 2N
 * 12
 */
public class Tarefa11b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = a | b;
        boolean d = a & b;
        boolean e = a ^ b;
        boolean f = (!a & b) | (a & !b);
        boolean g = !a;
        System.out.println(" a = "+a);
        System.out.println(" b = "+b);
        System.out.println(" a|b = "+c);
        System.out.println(" a&b = "+d);
        System.out.println(" a^b = "+e);
        System.out.println(" !a&b|a&!b = "+f);
        System.out.println(" !a = "+g);
        
    }
    
}
