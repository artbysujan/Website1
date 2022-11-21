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
       int number = 1;
        int valor = 5;
        for( int i = 2; i <= valor; i++ )
        {
        number *= i;
        }
        JOptionPane.showMessageDialog(null,"Ficha de Trabalho nº10\nTarefa 6\nO fatorial de 5 = "+number+"\nA soma (1 a 100) = "+((1+100)*100/2),"Módulo 9 - Introdução à Programação OO",
        JOptionPane.PLAIN_MESSAGE);
        // imagem invalido //
    }
    
}
