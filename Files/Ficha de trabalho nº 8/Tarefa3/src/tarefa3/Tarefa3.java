/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarefa3;

import javax.swing.JOptionPane;

/**
 *
 * @author Rajendra pandit
 * Turma : 2N
 * Número: 12
 * Data: 5/11/2022
 */
public class Tarefa3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int a;
       String string;
        string = JOptionPane.showInputDialog(null," Porfavor introduza o Número ");
        a = Integer.parseInt(string);
        if(a>0){
            JOptionPane.showMessageDialog(null,"O Números é Positivo");}
        else{            JOptionPane.showMessageDialog(null,"O Números Não é Positivo");}
}
    }
