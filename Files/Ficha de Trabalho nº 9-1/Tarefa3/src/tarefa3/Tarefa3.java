/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarefa3;

import java.util.Vector;

/**
 *
 * @author Rajendra pandit
 * Turma: 2N
 * Número : 12
 * Data:5/11/2022
 */
public class Tarefa3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int a,b,c,val = 1,val2=1;
       for(a=1;a<=8; ++a){
       System.out.print(a);
       System.out.printf(" = ");
       System.out.println(val2);
       if(val2 == (1*2*3*4*5*6*7*8)){break;}
       else{
       for(b=1;b<=a;b++)
         System.out.printf("%d X ",b);
         int val1 = b;
         if(val1 == 1)
         { val2 = val1;}
         else{int val3 = val1 * val2;
         val2 = val3;
         }}
         
       }
       
    }
    
}
