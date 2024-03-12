/*
 *  Receba o número de voltas, a extensão do circuito (em metros) e o tempo de
 *  duração (minutos). Calcule e mostre a velocidade média em km/h.
 */


import javax.swing.*;

public class Lt01_EstDec27 {
    public static void main(String[] arg){
        double numVol, percurso, deltaT, deltaS, velMedia;

        numVol = Double.parseDouble(JOptionPane.showInputDialog("Numero de voltas: "));
        percurso = Double.parseDouble(JOptionPane.showInputDialog("Tamanho do circuito: "));
        deltaT = Double.parseDouble(JOptionPane.showInputDialog("Tempo gasto: "));

        deltaS = (numVol*percurso);
        velMedia = (deltaS/deltaT);

        JOptionPane.showMessageDialog(null,"Velocidade media"+velMedia);
    }
}
