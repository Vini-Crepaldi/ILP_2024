/*
 * Calcule a quantidade de litros gastos em uma viagem, sabendo que o
 * automóvel faz 12 km/l. Receber o tempo de percurso e a velocidade média
 */

import javax.swing.*;
public class Lt01_Proc17 {

    static void calculaLitro(double velMedia, double tempoPer){
        double litros = (velMedia*tempoPer)/12;

        JOptionPane.showMessageDialog(null,"Quantidade de litros"+litros);
    }

    public static void main(String[] args) {
        double velMedia, tempoPer;

        velMedia = Double.parseDouble(JOptionPane.showInputDialog("Velocidade media"));
        tempoPer = Double.parseDouble(JOptionPane.showInputDialog("Tempo "));


        calculaLitro(velMedia,tempoPer);

    }
}
