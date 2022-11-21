/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarefa12;

import javax.swing.JOptionPane;

/**
 *
 * @author Rajendar pandit
 * 2N
 * 12
 */
public class Tarefa12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String value;
        int valueint;
        value = JOptionPane.showInputDialog(" Por Favor introduza número 1 ");
        valueint = Integer.parseInt(value);
        if ( valueint == 1){
            JOptionPane.showMessageDialog(null," Good, Esta número é número 1");
        }
        else{
            JOptionPane.showMessageDialog(null," Disculpa esta número não e Número 1");
        }
    }
    
}
