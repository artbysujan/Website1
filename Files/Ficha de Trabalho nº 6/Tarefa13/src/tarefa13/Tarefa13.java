/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarefa13;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Rajendra pandit
 * 2N
 * 12
 */
public class Tarefa13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    String value;
    int valueint;
   value= JOptionPane.showInputDialog("Ola bomdia ");
   valueint= Integer.parseInt(value);
   System.out.println(valueint);
   JOptionPane.showMessageDialog(null," O número digitado é "+valueint);
    }
}