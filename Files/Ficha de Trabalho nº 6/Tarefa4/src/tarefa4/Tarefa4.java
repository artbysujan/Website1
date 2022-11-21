/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarefa4;

import javax.swing.JOptionPane;

/**
 *
 * @author Rajendra pandit
 */
public class Tarefa4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String value;
        int valueint;
     value = JOptionPane.showInputDialog(" Introduza o número :");
      valueint = Integer.parseInt(value);
      switch(valueint){
          case 1: JOptionPane.showMessageDialog(null," Esta é número 1 "); break;
          case 2: JOptionPane.showMessageDialog(null," Esta é número 2"); break;
          case 3: JOptionPane.showMessageDialog(null," Esta é número 3"); break;
          default: JOptionPane.showMessageDialog(null," Disculpa esta é Default");break;
      }
    }
    
}
