
//Receba o número da base e do expoente. Calcule e mostre o valor da potência.

import javax.swing.JOptionPane;

public class Lt01_EstRep44 {
    public static void main(String[] args) {
        int base, expoente;

        base = Integer.parseInt(JOptionPane.showInputDialog("Qual a base? "));
        expoente = Integer.parseInt(JOptionPane.showInputDialog("Qual o expoente? "));

        int acumulador = base;

        for(int cta = 2; cta <= expoente; cta++){
            acumulador = (acumulador * base);
        }
        JOptionPane.showMessageDialog(null, "Potencia: "+acumulador);

    }
}
