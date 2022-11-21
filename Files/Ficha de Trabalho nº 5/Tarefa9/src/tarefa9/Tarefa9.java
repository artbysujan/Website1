/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarefa9;

import javax.swing.JOptionPane;

/**
 *
 * @author Rajendra pandit
 * Turma : 2N
 * Número: 12
 * Data: 2/11/2022
 */
public class Tarefa9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    String value , value2;
    int value_1 , value_2;
    value = JOptionPane.showInputDialog(" Porfavor Introduza o Número ");
    value_1 = Integer.parseInt(value);
    value2 = JOptionPane.showInputDialog(" Porfavor Introduza o 2 Número ");
    value_2 = Integer.parseInt(value2);
     JOptionPane.showMessageDialog(null,
             value_1+"\t\t > "+value_2+ " = "+(value_1>value_2)+"\n"+
             value_1+"\t\t < "+value_2+ " = "+(value_1<value_2)+"\n"+
             value_1+"\t\t <= "+value_2+ " = "+(value_1<=value_2)+"\n"+
             value_1+"\t\t >= "+value_2+ " = "+(value_1>=value_2)+"\n"+
             value_1+"\t\t == "+value_2+ " = "+(value_1==value_2)+"\n"+
             value_1+"\t\t = "+value_2+ " = "+(value_1=value_2)+"\n"+
             value_1+"\t\t != "+value_2+ " = "+(value_1!=value_2)+"\n"
     );
   
    }
    
}
