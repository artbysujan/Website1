/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarefa3;

import javax.swing.JOptionPane;

/**
 *
 * @author Rajendar pandit
 * Turma: 2N
 * Número: 12
 * Data: 02/11/2022
 */
public class Tarefa3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String number;
       int Number;
       number  = JOptionPane.showInputDialog(" Porfavor introduza o Nùmero 1 a 12");
       Number = Integer.parseInt(number);
       switch(Number){
           case 1: JOptionPane.showMessageDialog(null," É janeiro ");break;
           case 2: JOptionPane.showMessageDialog(null," É Fevereiro ");break;
           case 3: JOptionPane.showMessageDialog(null," É Março ");break;
           case 4: JOptionPane.showMessageDialog(null," É Abril ");break;
           case 5: JOptionPane.showMessageDialog(null," É Maio ");break;
           case 6: JOptionPane.showMessageDialog(null," É Junho ");break;
           case 7: JOptionPane.showMessageDialog(null," É Julho ");break;
           case 8: JOptionPane.showMessageDialog(null," É Agosto ");break;
           case 9: JOptionPane.showMessageDialog(null," É Setembro ");break;
           case 10:JOptionPane.showMessageDialog(null," É Outubro ");break;
           case 11: JOptionPane.showMessageDialog(null," É Novembro ");break;
           case 12: JOptionPane.showMessageDialog(null," É Dezembro ");break;
           default: JOptionPane.showMessageDialog(null," Disculpa Não Ha mes com esta Número ");break;
                  
       }
       
    }
    
}
