
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarefa2;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Rajendra pandit
 * Turma: 2N
 * Número: 12
 * Data: 2/11/2022
 */
public class Tarefa2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner entrada = new Scanner (System.in);
     String string;
     string = JOptionPane.showInputDialog(null," Por favor introduza a string 'Javascript'");
     JOptionPane.showMessageDialog(null,"Substring(5, 10) = "+string.substring(5, 10));
     int length = string.length();
     if (length >= 15)
     {JOptionPane.showMessageDialog(null,"Substring(5, 15) = "+string.substring(5, 15));}
     else{JOptionPane.showMessageDialog(null,"Disculpa o letras de string não e suficent "+length);}
    }
    
}
