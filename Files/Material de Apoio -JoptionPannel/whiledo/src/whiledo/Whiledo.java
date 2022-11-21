/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whiledo;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author rajendra pandit
 * 2N
 * 12
 */
public class Whiledo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int a,b=0;
        String value;
        value = JOptionPane.showInputDialog("Please Enter how many time you want to print lol: ");
        a = Integer.parseInt(value);
       while (b < a){
          JOptionPane.showMessageDialog(null,"Lol"+ (b+1));
          b++;
         
       }
    }
    
}





















