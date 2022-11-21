/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifelsejoptionpane;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Rajedra pandit
 */
public class IfelseJOptionPane {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);                 
        String Snumber;
        int number;
        Snumber = JOptionPane.showInputDialog(" Porfavor introduza número par : ");
        number = Integer.parseInt(Snumber);
        if(number%2 ==0){
           JOptionPane.showMessageDialog(null, " o número "+number+" é par");}
        else{JOptionPane.showMessageDialog(null,"o número "+number+" é impar");}
    }
    
}
