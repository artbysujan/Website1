/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarefa1;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author rajendra pandit
 * Turma: 2N
 * Número: 12
 * Data: 02/11/2022
 */
public class Tarefa1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String string;
        string = JOptionPane.showInputDialog("Por favor introduza String :");
        string = string.replace("h", "s");
        JOptionPane.showMessageDialog(null,string);
        string = string.replace("s", "h");
        JOptionPane.showMessageDialog(null,string);
        
    }
    
}
