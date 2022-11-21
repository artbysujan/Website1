/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarefa6;

import javax.swing.JOptionPane;

/**
 *
 * @author Rajendara pandit
 * Turma : 2N
 * Número: 12
 * Data : 5/11/2022
 */
public class Tarefa6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int a=3,b=12,c=4;
        double d=3.5,e=7.21;
        JOptionPane.showMessageDialog(null,a+" km = "+(a*1000)+" m\n"+b+" m = "+(b*10)+" dm\n"+c+" cm = "+(c*10)+" mm\n"+d+" m = "+(d*100)+" cm\n" +e+" m = "+(e*100)+" cm\n"     ,"Conversões",
        JOptionPane.INFORMATION_MESSAGE);
    }
    
}
