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
 * Turma : 2N
 * Número: 12
 * Data: 5/11/2022
 */
public class Tarefa4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String string;
    int a;
    string = JOptionPane.showInputDialog(" Porfavor introduza o Número ");
    a = Integer.parseInt(string);
    if(a >=50 && a<=100){
       JOptionPane.showMessageDialog(null," o número esta dentro de intervalo 50 -100 = "+a);
    }
    else{
       JOptionPane.showMessageDialog(null," o número não esta dentro de intervalo 50 -100 = "+a);
    }
    }
    
}
