//Coletar o valor do lado de um quadrado, calcular sua área e apresentar o resultado

import javax.swing.*;


public class Lt01_EstSeq01{


    public static void main(String[] args) {
        int lado;

        lado = Integer.parseInt(JOptionPane.showInputDialog("Lado: "));

        lado = lado * lado;

        JOptionPane.showMessageDialog(null, "A area e: "+lado);
    }
}