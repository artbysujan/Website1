/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarefa3;

import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author Rajendra pandit
 * Turma: 2N
 * Número: 12
 * Data: 3/11/2022
 */
public class Tarefa3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int a,g;
       Vector <Integer> number = new Vector <>();
       Vector <Integer> number1 = new Vector <>();
       Vector <Integer> number2 = new Vector <>();
       for(a=1;a<=35; ++a){
         number.add(a);
       }
       for(a=35;a>=1; --a){
         number1.add(a);
       }
        for (a=2; a<35; a=a+2)
            number2.add(a);
    JOptionPane.showMessageDialog(null,number+"\n"+number1+"\n"+number2,"\n"+"\n",JOptionPane.PLAIN_MESSAGE);
    JOptionPane.showMessageDialog(null,"Soma de 1 até 35 = "+((1+35)*35/2));
    } 
    
}
