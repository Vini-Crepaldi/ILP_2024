/*
 *  Receba 3 valores obrigatoriamente em ordem crescente e um 4º valor não necessariamente em ordem.
 *  Mostre os 4 números em ordem crescente.
 */

import javax.swing.*;
public class Lt01_EstDec23 {
    public static void main(String[] args) {
        int v1, v2, v3, v4;

        v1 = Integer.parseInt(JOptionPane.showInputDialog("Primeiro numero "));
        v2 = Integer.parseInt(JOptionPane.showInputDialog("Segundo numero "));
        v3 = Integer.parseInt(JOptionPane.showInputDialog("Terceiro numero "));
        v4 = Integer.parseInt(JOptionPane.showInputDialog("Quarto numero "));


        if ((v4 > v1) && (v4 < v2)){
            JOptionPane.showMessageDialog(null,v1+" "+v4+" "+v2+" "+v3);
        }else{
            if((v4 > v2)&&(v4 < v3)){
                JOptionPane.showMessageDialog(null,v1+" "+v2+" "+v4+" "+v3);
            }else{
                if(v4<v1){
                    JOptionPane.showMessageDialog(null,v4+" "+v1+" "+v2+" "+v3);
                }else{
                    JOptionPane.showMessageDialog(null,v1+" "+v2+" "+v3+" "+v4);
                }
            }
        }
    }
}
