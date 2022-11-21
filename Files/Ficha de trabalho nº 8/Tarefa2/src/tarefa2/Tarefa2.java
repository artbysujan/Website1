/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarefa2;

import javax.swing.JOptionPane;

/**
 *
 * @author Rajendra pandit
 * Turma : 2N
 * Número: 12
 * Data: 5/11/2022
 */
public class Tarefa2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String string;
        int a , b;
        string = JOptionPane.showInputDialog(null," Porfavor introduza o 1 Número ");
        a = Integer.parseInt(string);
        string = JOptionPane.showInputDialog(null," Porfavor introduza o 2 Número ");
        b = Integer.parseInt(string);
        if ( a == b){
        JOptionPane.showMessageDialog(null," Os números são iguais");
        }else{
                    JOptionPane.showMessageDialog(null," Os números não são iguais");

        }
    }}
