/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarefa8;

import javax.swing.JOptionPane;

/**
 *
 * @author Rajendra pandit
 * Turma: 2N
 * Número: 12
 * Date: 6/11/2022
 */
public class Tarefa8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String age;
        int ageint;
        age = JOptionPane.showInputDialog(null, "Qual é a sua idade ");
        ageint = Integer.parseInt(age);
        if(ageint>0 && ageint<=18)
        {
           JOptionPane.showMessageDialog(null,"A Sua idade é "+ageint+" é menor de idade");
        }else if(ageint < 0){
        JOptionPane.showMessageDialog(null," Erro ");
        }else{JOptionPane.showMessageDialog(null,"A Sua idade é "+ageint+" é maior de idade");}
    }
    
}
