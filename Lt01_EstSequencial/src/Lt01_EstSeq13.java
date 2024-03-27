/* Receba a quantidade de alimento em quilos. Calcule e mostre quantos dias
 * durará esse alimento sabendo que a pessoa consome 50g ao dia.
 */

import javax.swing.*;

public class Lt01_EstSeq13 {
    public static void main(String[] args){
        int kg,dia;

        kg = Integer.parseInt(JOptionPane.showInputDialog("Qual a quantida de alimentos em KG? "));

        dia = ((kg * 1000)/50);

        JOptionPane.showMessageDialog(null,dia + " Dias");



    }
    
}
