/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfor;

import java.util.Scanner;
import javax.swing.JOptionPane;


/**
 *
 * @author rajendra pandit
 * 2N
 * 12
 */
public class For {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String value;
        int valueint,a;
        value = JOptionPane.showInputDialog(" Please enter the number ");
        valueint = Integer.parseInt(value);
        for ( a=1; a<=valueint; a++){
           JOptionPane.showMessageDialog(null," this is the lol "+a);
        }
    }
    
}