/* Receba a quantidade de horas trabalhadas, o valor por hora, o percentual
 * de desconto e o número de descendentes. Calcule o salário que serão as
 * horas trabalhadas x o valor por hora. Calcule o salário líquido (= Salário
 * Bruto – desconto). A cada dependente será acrescido R$ 100 no Salário
 * Líquido. Exiba o salário a receber.
 */

import javax.swing.*;

public class Lt01_EstSeq16{
    public static void main(String[] args){

        double quantHora, valorHora, desc, numDepen, liquido, bruto;

        quantHora = Double.parseDouble(JOptionPane.showInputDialog("Horas trabalhadas"));
        valorHora = Double.parseDouble(JOptionPane.showInputDialog("Valor hora"));
        desc = Double.parseDouble(JOptionPane.showInputDialog("Desconto"));
        numDepen = Double.parseDouble(JOptionPane.showInputDialog("Dependente"));


        bruto = (valorHora * quantHora);
        desc = (bruto *(desc/100));
        liquido = (bruto - desc) + (numDepen * 100);


        JOptionPane.showMessageDialog(null,"salario a receber " + liquido);





    }

 }


 