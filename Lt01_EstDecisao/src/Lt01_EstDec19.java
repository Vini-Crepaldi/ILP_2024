//Receba 2 valores reais. Calcule e mostre o maior deles.

import javax.swing.*;
public class Lt01_EstDec19{

    public static void main(String[] args) {
        double v1, v2;

        v1 = Integer.parseInt(JOptionPane.showInputDialog("Primeiro valor"));
        v2 = Integer.parseInt(JOptionPane.showInputDialog("Segundo valor"));

        if(v1>v2){
            JOptionPane.showMessageDialog(null,"O maior e: "+v1);
        }
        if(v1<v2){
            JOptionPane.showMessageDialog(null,"O maior e: "+ v2);
        }
    }
}