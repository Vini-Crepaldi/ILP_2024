/*
 * Receba 2 valores inteiros e diferentes. Mostre seus valores em ordem
 * crescente.
 */

import javax.swing.*;

public class Lt01_Proc22 {

    static void ordemCres(int x, int y){
        if(x<y){
            JOptionPane.showMessageDialog(null, x+ " " + y);
        }else{
            JOptionPane.showMessageDialog(null, y+ " " + x);

        }
    }
    public static void main(String[] args) {
        int v,j;

        v = Integer.parseInt(JOptionPane.showInputDialog("Valor "));
        j = Integer.parseInt(JOptionPane.showInputDialog("Valor "));

        ordemCres(v,j);

        
    }
}
