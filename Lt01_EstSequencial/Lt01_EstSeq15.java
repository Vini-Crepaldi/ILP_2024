//Receba os valores de 2 catetos de um triângulo retângulo. Calcule e mostre a hipotenusa.

import javax.swing.*;

public class Lt01_EstSeq15 {

    public static void main(String[] args) {
        double c1,c2,hipo;

        c1 = Double.parseDouble(JOptionPane.showInputDialog("Primeiro cateto?: "));
        c2 = Double.parseDouble(JOptionPane.showInputDialog("Segundo cateto?: "));

        hipo = Math.sqrt(((c1*c1) +(c2*c2)));

        JOptionPane.showMessageDialog(null,"Hipotenusa: "+ hipo);

    }
    
}
