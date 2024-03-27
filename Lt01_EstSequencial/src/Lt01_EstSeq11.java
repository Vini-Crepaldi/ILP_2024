//Receba o raio de uma circunferência. Calcule e mostre o comprimento da circunferência.

import javax.swing.*;

public class Lt01_EstSeq11{
    public static void main(String[] arg){
        double raio, comprimento;
    
        raio = Double.parseDouble(JOptionPane.showInputDialog("Qual o raio da circunferencia? "));
        comprimento = ((2 * raio) * 3.14);
        JOptionPane.showMessageDialog(null,"O valor da comprimento e : " + comprimento);



    }
}