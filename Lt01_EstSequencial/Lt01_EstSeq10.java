
//10. Receba 2 números reais. Calcule e mostre a diferença desses valores.


import javax.swing.*;
public class Lt01_EstSeq10 {
    public static void main(String[] args) {
        double num1, num2;

        num1 = Double.parseDouble(JOptionPane.showInputDialog("Numero 1"));
        num2 = Double.parseDouble(JOptionPane.showInputDialog("Numero 2"));

        num1 = num1 - num2;

        JOptionPane.showMessageDialog(null,"Diferença: "+num1);
    }
    
}