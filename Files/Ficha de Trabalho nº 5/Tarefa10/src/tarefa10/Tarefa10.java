/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarefa10;

import javax.swing.JOptionPane;

/**
 *
 * @author Rajendar pandit
 * Turma: 2N
 * Número: 12
 * Data: 02/11/2022
 */
public class Tarefa10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   String value;
   float a;
   value = JOptionPane.showInputDialog(" Porfavor Introduza uma nota entre 0.0 - 10.0");
   a = Float.parseFloat(value);
   if(a <= 10.0 && a >=0.0){
     JOptionPane.showMessageDialog(null," Nota Válido = "+ a);
   }
   else { JOptionPane.showMessageDialog(null," Nota inválida = "+a); }
    }
    
}
