/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soma.dos.números;

import javax.swing.JOptionPane;

/**
 *
 * @author Rajendra pandit
 * 2N
 * 12
 */
public class SomaDosNúmeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String firstnumber, secondnumber;
        int first, second;
        firstnumber = JOptionPane.showInputDialog("Digite o 1 valor: ");
        first = Integer.parseInt(firstnumber);
        secondnumber = JOptionPane.showInputDialog("Digite o 2 valor: ");
        second = Integer.parseInt(secondnumber);
        JOptionPane.showMessageDialog(null, " A soma de "+first+" com "+second+" = "+(first+second));
        
    }
    
}
