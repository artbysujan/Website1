/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarefa4;

import javax.swing.JOptionPane;

/**
 *
 * @author artby
 */
public class Tarefa4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a,b,c;
       String str;
       String str2;
       String str3;
       str = JOptionPane.showInputDialog("Operações Aritméticas entre números inteiros:\n[1] Adição\n[2] Subtração\n[3] Multiplicação\n[4] Divisão\n[5] Resto");
       c = Integer.parseInt(str);
       switch(c)
       {
           case 1:str2 = JOptionPane.showInputDialog("Indique o valor de A:");
                  a = Integer.parseInt(str2);str3 = JOptionPane.showInputDialog("Indique o valor de B:");
                  b = Integer.parseInt(str3);JOptionPane.showMessageDialog(null,"A soma é "+(a+b));break;
           case 2:str2 = JOptionPane.showInputDialog("Indique o valor de A:");a = Integer.parseInt(str2);
                  str3 = JOptionPane.showInputDialog("Indique o valor de B:");b = Integer.parseInt(str3);
               JOptionPane.showMessageDialog(null,"A subtração é "+(a-b));break;
           case 3:str2 = JOptionPane.showInputDialog("Indique o valor de A:");
                  a = Integer.parseInt(str2);str3 = JOptionPane.showInputDialog("Indique o valor de B:");
                  b = Integer.parseInt(str3);JOptionPane.showMessageDialog(null,"A multiplicação é "+(a*b));break;
           case 4:str2 = JOptionPane.showInputDialog("Indique o valor de A:");
                  a = Integer.parseInt(str2);str3 = JOptionPane.showInputDialog("Indique o valor de B:");
                  b = Integer.parseInt(str3);JOptionPane.showMessageDialog(null,"A divisão é "+(a/b));break;
           case 5:str2 = JOptionPane.showInputDialog("Indique o valor de A:");
                  a = Integer.parseInt(str2);str3 = JOptionPane.showInputDialog("Indique o valor de B:");
                  b = Integer.parseInt(str3);JOptionPane.showMessageDialog(null,"O resto é "+(a%b));break;
           default:JOptionPane.showMessageDialog(null,"Opção inválida","                                ERRO",
                   JOptionPane.ERROR_MESSAGE);
    }
    
    }}
