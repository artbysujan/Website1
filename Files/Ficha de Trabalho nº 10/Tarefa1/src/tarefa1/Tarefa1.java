/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarefa1;

import javax.swing.JOptionPane;

/**
 *
 * @author Rajendra pandit
 * Turma: 2N
 * Número: 12
 * Data: 2/11/2022
 * Tarefa:1
 * Ficha: 10
 */
public class Tarefa1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int a = 4, x = -3, b = -2;
        JOptionPane.showMessageDialog(null,
                "x = "+x+"\n"+
                "a = "+a+"\n"+
                "b = "+b+"\n"+
                "3*x-1 = "+((3*x)-1)+"\n"+
                "5*(x*x)-5 = "+((5*(x*x))-5)+"\n"+
                "(8*a+2*b) = "+(8*a+2*b)+"\n"+
                "(7*a-2b) = "+((7*a)-2*b)+"\n"+
                "5*a*b-5*a = "+(5*a*b-5*a)+"\n",
                "Resumo",JOptionPane.PLAIN_MESSAGE);
    }
    
}
