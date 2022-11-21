/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarefa10;

import javax.swing.JOptionPane;

/**
 * @author Rajendra pandit
 * Turma: 2N
 * Número: 12
 * Date: 6/11/2022
 */

public class Tarefa10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String value;
       int A,B;
       value = JOptionPane.showInputDialog(null,"Porfavor introduza  valor de a ");
       A = Integer.parseInt(value);
    
       value = JOptionPane.showInputDialog(null,"Porfavor introduza  valor de b ");
       B = Integer.parseInt(value);
       JOptionPane.showMessageDialog(null,
               " A+B = "+(A+B)+"\n"+
               " A* A +B = "+((A*A)+B)+"\n"+
               " 2 * A + 2 * B = "+((2*A)+(2*B))+"\n"+
               "A * A + 2 * A *B + B * B = "+((A*A)+(2*A*B)+(B*B))+"\n","Operações Aritméticas",JOptionPane.PLAIN_MESSAGE);
       
       
    }}
