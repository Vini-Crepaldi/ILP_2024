/* 
 * Receba 2 números inteiros, verifique qual o maior entre eles. 
 * Calcule e mostre o resultado da somatória dos números ímpares entre esses valores.
 */

import javax.swing.JOptionPane;

public class Lt01_EstRep35 {
    public static void main(String[] args) {
        int n1, n2, acumulador = 0 ;

        n1 = Integer.parseInt(JOptionPane.showInputDialog("numero 1"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("numero 2"));

        
        if (n1 < n2) {
            for ( int cta = (n1 + 1); cta < n2 ; cta++ ){
                if((cta % 2) != 0 ){
                    acumulador = (acumulador + cta);
                }
            }
            System.out.println(acumulador);
        }else{
            for ( int cta = (n2 + 1); cta < n1 ; cta++ ){
                if((cta % 2) != 0 ){
                    acumulador = (acumulador + cta);
                }
            }

            System.out.println(acumulador);
        }
    }
}
