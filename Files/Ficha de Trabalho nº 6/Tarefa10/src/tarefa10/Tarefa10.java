/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarefa10;

import javax.swing.JOptionPane;

/**
 *
 * @author Rajendra pandit
 * 2N
 * 12
 */
public class Tarefa10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
             String wrd;
    int a;        
        
        wrd = JOptionPane.showInputDialog(null, "Intruduza um numero ");
         a= Integer.parseInt(wrd);
        if (a>0)
        {
            JOptionPane.showMessageDialog(null,"Numero positivo");
        }    
        else
        {
            if (a==0)
            {
              JOptionPane.showMessageDialog(null,"Zero");  
            }
            else
            {
                if(a<0)
                {
                  JOptionPane.showMessageDialog(null,"Numero negativo");    
                }
            }
        }
    }
    
}
