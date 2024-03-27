//Receba 2 valores inteiros e diferentes. Mostre seus valores em ordem crescente.


import javax.swing.*;
public class Lt01_EstDec22 {
    public static void main(String[] args) {
        int v1,v2;

        v1 = Integer.parseInt(JOptionPane.showInputDialog("Valor 1"));
        v2 = Integer.parseInt(JOptionPane.showInputDialog("Valor 2"));

        if (v1<v2){
            JOptionPane.showMessageDialog(null,v1+ " "+v2);
        }else{
            if (v1>v2){
                JOptionPane.showMessageDialog(null,v2+ " "+v1);
            }
        }
    }
}
