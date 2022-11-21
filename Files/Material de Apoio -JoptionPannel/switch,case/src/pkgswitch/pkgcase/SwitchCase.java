/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgswitch.pkgcase;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author rajendra pandit
 * 2N
 * 12
 */
public class SwitchCase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String value;
        int number;
        value = JOptionPane.showInputDialog(" Please Enter the number 1 to 3 : ");
        number = Integer.parseInt(value);
        switch(number){
            case 1: JOptionPane.showMessageDialog(null," This is the case 1");break;
            case 2: JOptionPane.showMessageDialog(null," This is the case 2");break;
            case 3: JOptionPane.showMessageDialog(null," This is the case 3");break;
            default: JOptionPane.showMessageDialog(null," This is the default ' lol '");break;
        }
        
    }
    
}
