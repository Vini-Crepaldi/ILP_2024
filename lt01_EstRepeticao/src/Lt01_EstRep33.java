
//Receba um número. Calcule e mostre a série 1 + 1/2 + 1/3 + ... + 1/N.

import javax.swing.*;

public class Lt01_EstRep33 {
    public static void main(String[] args) {
        double num, acumulador = 1, divisivel = 2;

        num = Integer.parseInt(JOptionPane.showInputDialog("Qual numero"));

        
        while (divisivel <= num) {
            acumulador = (acumulador + 1/divisivel);
            divisivel++;
            System.out.println(acumulador);;
        }
        
        
        //acumulador += 1/divisivel;

    }
}
