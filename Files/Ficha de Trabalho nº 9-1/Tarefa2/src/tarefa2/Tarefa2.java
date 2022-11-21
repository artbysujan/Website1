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
 * Número:12
 * Date: 5/11/2022
 */
public class Tarefa2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,
                "Metodo ceil (5.2) = "+Math.ceil(5.2)+"\n"+
                "Metodo ceil (-5.8) = "+Math.ceil(-5.8)+"\n"+
                "Metodo exp (5) = "+Math.exp(5)+"\n"+
                "Metodo exp (0.5) = "+Math.exp(0.5)+"\n"+
                "Metodo floor (5.2) = "+Math.exp(5.2)+"\n"+
                "Metodo floor (-5.8) = "+Math.exp(-5.8)+"\n"+
                "Metodo max (10,15) = "+Math.max(10,15)+"\n"+
                "Metodo max (-5.9,-4.5) = "+Math.max(-5.9,-4.5)+"\n"+
                "Metodo max (10,5.9) = "+Math.max(10,5.9)+"\n"+
                "Metodo Min (10,15) = "+Math.min(10,15)+"\n"+
                "Metodo Min (-5.9,-4.5) = "+Math.min(-5.9,-4.5)+"\n"+
                "Metodo Min (10,-4.5) = "+Math.min(10,-4.5)+"\n"+
                "Metodo Pow (5.5,2) = "+Math.pow(5.5,2)+"\n"+
                "Metodo Sqrt (900) = "+Math.sqrt(900)+"\n"+
                "Metodo Sqrt (30.25) = "+Math.sqrt(30.25)+"\n",
                "Tarefa 2",JOptionPane.PLAIN_MESSAGE);
    }
    
}
