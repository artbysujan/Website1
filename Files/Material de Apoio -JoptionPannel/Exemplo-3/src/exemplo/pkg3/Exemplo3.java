/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo.pkg3;

import javax.swing.JOptionPane;

/**
 *
 * @author Rajendra pandit
 * 2N
 * 12
 */
public class Exemplo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String numb;
        int number;
    numb = JOptionPane.showInputDialog("Please Select Option ");
    number = Integer.parseInt(numb);
    System.out.println(number);
    }
    
}
