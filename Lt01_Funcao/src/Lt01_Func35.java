/*
 * Receba 2 números inteiros, verifique qual o maior entre eles. Calcule e
 * mostre o resultado da somatória dos números ímpares entre esses valores.
 */

import javax.swing.JOptionPane;
public class Lt01_Func35 {

    static int somatoria(int v1, int v2){
        int ac = 0;

        for(int cta = (v1+1); cta < v2 ; cta++){
            if((cta % 2) != 0){
                ac = ac + cta;
            }
        }
        return ac;
    }   
    public static void main(String[] args) {
        int n1,n2;

        n1 = Integer.parseInt(JOptionPane.showInputDialog("numero 1"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("numero 2"));

        if(n1<n2){
            JOptionPane.showMessageDialog(null,somatoria(n1,n2));
        }else{
            JOptionPane.showMessageDialog(null,somatoria(n2,n1));
        }

    }
}
