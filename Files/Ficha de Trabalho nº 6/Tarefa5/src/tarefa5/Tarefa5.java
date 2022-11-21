/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarefa5;

import javax.swing.JOptionPane;

/**
 *
 * @author Rajendra Pandit
 * 2N
 * 12
 */
public class Tarefa5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       JOptionPane.showMessageDialog(null,"A = 14");
       JOptionPane.showMessageDialog(null,"B = 9");
       int a = 14;
       int b = 9;
       int c;
       c = a;
       a = b;
       b = c;
       JOptionPane.showMessageDialog(null," a = "+a+",  b = "+b);
       
       
    }
    
}
