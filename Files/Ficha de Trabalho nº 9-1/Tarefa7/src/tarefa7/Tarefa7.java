/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarefa7;

import javax.swing.JOptionPane;

/**
 *
 * @author Rajendra pandit
 * Turma: 2N
 * Número : 12
 * Data:5/11/2022
 */

public class Tarefa7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int val1 = 25, val2 = 12;
      JOptionPane.showMessageDialog(null, "A soma de "+val1+" com "+val2+" = "+(val1+val2)+"\n"+
              "Math.max(25,12)"+" =  "+Math.max(val1,val2)+"\n"+
              "Math.min(25,12)"+" =  "+Math.min(val2, val2),"Tarefa -7",JOptionPane.PLAIN_MESSAGE);
    }
    
}
