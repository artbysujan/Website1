/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * @author Rajendra pandit
 * 2N
 * 12
 */
public class Exemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String stra, strb;
        int a, b;
        stra = JOptionPane.showInputDialog(" Digite o Valor de A");
        a = Integer.parseInt(stra);
        strb = JOptionPane.showInputDialog(" Digite o Valor de B");
        b = Integer.parseInt(strb);
        JOptionPane.showMessageDialog(null, "A soma de "+a+" com "+b+" = "+(a+b));
    
    }
    
}
