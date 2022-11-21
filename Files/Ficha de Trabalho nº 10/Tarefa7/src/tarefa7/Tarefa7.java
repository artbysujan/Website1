/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarefa7;

import javax.swing.JOptionPane;

/**
 *
 * @author Rajendra pandit
 * Turma : 2N
 * Número: 12
 * Data :5/11/2022
 */
public class Tarefa7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String str;
        int a;
        str = JOptionPane.showInputDialog("Que icone deseja ver?\n[ 1 ] - Erro\n[ 2 ] - Informação\n[ 3 ] - Aviso\n[ 4 ] - Interrogação\n[ 5 ] - Nenhum");
        a = Integer.parseInt(str);
        switch(a)
        {
            case 1:JOptionPane.showMessageDialog(null, "", "Icone de Erro",
                   JOptionPane.ERROR_MESSAGE);break;
            case 2:JOptionPane.showMessageDialog(null, "", "Icone de Informação",
                   JOptionPane.INFORMATION_MESSAGE);break;
            case 3:JOptionPane.showMessageDialog(null, "", "Icone de Aviso",
                   JOptionPane.WARNING_MESSAGE);break;
            case 4:JOptionPane.showMessageDialog(null, "", "Icone de Interrogação",
                   JOptionPane.QUESTION_MESSAGE);break;
            case 5:JOptionPane.showMessageDialog(null, "", "Nenhum icone",
                   JOptionPane.PLAIN_MESSAGE);break;
            default:JOptionPane.showMessageDialog(null, "", "Opção Inválida",
                    JOptionPane.PLAIN_MESSAGE);break;
    }
    }
}
