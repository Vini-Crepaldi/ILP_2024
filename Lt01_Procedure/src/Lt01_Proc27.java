/*
 * Receba o número de voltas, a extensão do circuito (em metros) e o tempo de
 * duração (minutos). Calcule e mostre a velocidade média em km/h.
 */

import javax.swing.JOptionPane;

public class Lt01_Proc27 {

    static void velocidadeMedia(int num, int cir, double temp){
        double velMedia;
        velMedia = ((num*cir)/temp);
        JOptionPane.showMessageDialog(null,"Velocidade media: "+velMedia);
    }

    public static void main(String[] args) {
        int nVoltas, circuito;
        double tempo;

        nVoltas = Integer.parseInt(JOptionPane.showInputDialog("Numero de voltas "));
        circuito = Integer.parseInt(JOptionPane.showInputDialog("Numero de voltas "));
        tempo = Integer.parseInt(JOptionPane.showInputDialog("Numero de voltas "));

        velocidadeMedia(nVoltas,circuito,tempo);
    }
    

}
