/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author Rajendra pandit
 * 2N
 * 12
 */
public class Exemplo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 27;
        if(a%2 == 0){
           JOptionPane.showMessageDialog(null, " O número"+a+ "é par");}
        else{
            JOptionPane.showMessageDialog(null, " O número "+a+ " e impar");
        }
    }
    
}
