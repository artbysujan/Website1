/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarefa5;

import javax.swing.JOptionPane;

/**
 *
 * @author Rajendra pandit
 * Turma : 2N
 * Número: 12
 * Data: 5/11/2022
 */
public class Tarefa5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int a;
    String string;
    string = JOptionPane.showInputDialog(null,"Porfavor introduza o número");
    a = Integer.parseInt(string);
    if( a <=0)
    {
   JOptionPane.showMessageDialog(null,"O número é negativo" );
   /* System.out.println("O número é negativo ");*/
    }
    else if(a > 100)
    {
      JOptionPane.showMessageDialog(null,"Erro","Erro",JOptionPane.ERROR_MESSAGE);
     /*System.out.println("Erro ! maior que 100");*/
    }
    else{
        JOptionPane.showMessageDialog(null,"O número é positivo "+a);
        /*System.out.println("O número é positivo "+a);*/
    }
    
}}
