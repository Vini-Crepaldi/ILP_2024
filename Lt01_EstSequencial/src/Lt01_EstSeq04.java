/*
 *  Receba a temperatura em graus Celsius. Calcule e mostre a sua
 *  temperatura convertida em fahrenheit F = (9*C+160) /5.
 */



import javax.swing.*;
public class Lt01_EstSeq04 {
    public static void main(String[] args) {
        int temperatura;

        temperatura = Integer.parseInt(JOptionPane.showInputDialog("Temperatura C"));

        temperatura = ((9*temperatura+160)/5);

        JOptionPane.showMessageDialog(null,"F "+temperatura);
    }
}
