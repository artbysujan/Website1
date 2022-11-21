/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarefa5;

import javax.swing.JOptionPane;

/**
 *
 * @author Rajendra pandit
 * Turma: 2N
 * Número : 12
 * Data:5/11/2022
 */
public class Tarefa5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String input;
       int a , b ,c;
       input = JOptionPane.showInputDialog(" Digite o valor da letra a ");
       a = Integer.parseInt(input);
       input = JOptionPane.showInputDialog(" Digite o valor da letra b ");
       b = Integer.parseInt(input);
       input = JOptionPane.showInputDialog(" Digite o valor da letra c  ");
       c = Integer.parseInt(input);
       int value = ((b+(b*c)-(4*c))-a);
       JOptionPane.showMessageDialog(null," O Valor = "+value);
    }
    
}
