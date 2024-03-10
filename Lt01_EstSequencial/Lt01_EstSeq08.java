
//  Receba o valor de um depósito em poupança. Calcule e mostre o valor
//  após 1 mês de aplicação sabendo que rende 1,3% a. m.

import javax.swing.*;

public class Ex008 {
    public static void main(String[] args) {
        double valor, montante;

        valor = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do investimento: "));

        montante = valor * (1+(1.3/100)); // Tudo isso é elevado ao numero de messes;

        JOptionPane.showMessageDialog(null,"O valor atual é "+ montante);




    }

    
}
