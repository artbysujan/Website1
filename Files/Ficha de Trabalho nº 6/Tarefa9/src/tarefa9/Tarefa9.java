/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarefa9;

import javax.swing.JOptionPane;

/**
 *
 * @author Artbysujan
 */
public class Tarefa9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 String value;
 int intvalue;
        int value1 = 12;
        int value2 = 21;
        int value3 = 40;
         value = JOptionPane.showInputDialog(null, "Selecione em numero de 1 até 3");
         intvalue = Integer.parseInt(value);
        switch(intvalue)
        {
            case 1: JOptionPane.showMessageDialog(null,"15% de 80 = "+value1, "Ola", JOptionPane.PLAIN_MESSAGE);break;
            case 2: JOptionPane.showConfirmDialog(null, "70% de 30 = "+value2, "Ola", JOptionPane.PLAIN_MESSAGE);break;
            case 3: JOptionPane.showConfirmDialog(null, "100% de 40 = "+value3, "ola", JOptionPane.PLAIN_MESSAGE);break;
            default: System.out.printf(" Error ");break;
        }
    }
    
}
