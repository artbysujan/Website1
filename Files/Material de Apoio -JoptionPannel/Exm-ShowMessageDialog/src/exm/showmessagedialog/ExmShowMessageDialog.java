/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exm.showmessagedialog;

import javax.swing.JOptionPane;

/**
 *
 * @author Rajendra Pandit
 */
public class ExmShowMessageDialog {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nome;
        nome = JOptionPane.showInputDialog(" Qual o seu nome :");
        JOptionPane.showMessageDialog (null, "Olá, O Seu nome é "+nome);
    }
    
}
