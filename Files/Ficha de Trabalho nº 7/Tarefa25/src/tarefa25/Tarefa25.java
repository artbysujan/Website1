/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarefa25;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Rajendra Pandit
 * Turma : 2N
 * Número : 12
 * Data : 5/11/2022
 */
public class Tarefa25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         ImageIcon imagem = new ImageIcon("url");
        JOptionPane.showMessageDialog(null, "I Like Youtube", "Icon Personalizado", JOptionPane.INFORMATION_MESSAGE, imagem);
    }
    
}
