/* Calcule a quantidade de litros gastos em uma viagem, sabendo que o 
 * automóvel faz 12 km/l. Receber o tempo de percurso e a velocidade média
 */


import javax.swing.*;


public class Lt01_EstSeq17 {
    public static void main(String[] args) {
        int litro, tempoPercurso, vm;

         tempoPercurso = Integer.parseInt(JOptionPane.showInputDialog("Tempo"));
         vm = Integer.parseInt(JOptionPane.showInputDialog("velocidade media"));

        litro = (tempoPercurso * vm)/12
        ;

        JOptionPane.showMessageDialog(null,litro+ " Litros");

    }
}
