//Receba 2ângulos de um triângulo. Calcule e mostre o valor do 3º ângulo

import javax.swing.*;


public class Lt01_EstSeq14 {
    public static void main(String[] args) {
        int a1, a2, a3;

        a1 = Integer.parseInt(JOptionPane.showInputDialog("Primerio angulo: "));
        a2 = Integer.parseInt(JOptionPane.showInputDialog("Segundo angulo: "));

        a3 = (180-(a2+a1));


        JOptionPane.showMessageDialog(null,"O terceiro: "+a3);
    }
}   
