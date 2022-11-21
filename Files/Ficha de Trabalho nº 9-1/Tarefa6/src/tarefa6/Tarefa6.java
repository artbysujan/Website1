/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarefa6;

import javax.swing.JOptionPane;

/**
 *
 * @author Rajendra pandit
 * Turma: 2N
 * Número : 12
 * Data:5/11/2022
 */
public class Tarefa6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Object[] options = {"Preto", "Branco", "vermelho","Azul"};
        Object selection = JOptionPane.showInputDialog(null, "Escolha entre quatro cores", "Menu", JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
        if(selection == "Preto"){
             JOptionPane.showMessageDialog(null,"Você deve ser um gótico!");
        }else if(selection == "Branco"){
             JOptionPane.showMessageDialog(null,"Você é uma pessoa muito pura");
        }else if(selection == "vernelho"){
                 JOptionPane.showMessageDialog(null,"Você é divertido e extrovertido");
                }else if(selection == "Azul"){
                    JOptionPane.showMessageDialog(null,"Você não é fã de chelsea, é ?");
                }
    }
    
}
