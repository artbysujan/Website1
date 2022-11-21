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
 * Turma: 2N
 * Número: 12
 * Data: 3/11/2022
 */
public class Tarefa2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a =2, b= a*4, c= a%b, d= 9,e =10, f= 1,g=2;
        a+=2; d-=2; e/=2; f+=g;
        JOptionPane.showMessageDialog(null,
                "A = "+a+"\n"+
                "B = "+b+"\n"+
                "C = "+c+"\n"+
                "D = "+d+"\n"+
                "E = "+e+"\n"+
                "F = "+f+"\n"
                ,"Tarefa 3 - Tarefa 2",JOptionPane.PLAIN_MESSAGE);
    }
    
}
