/*
 * Receba a quantidade de horas trabalhadas, o valor por hora, o percentual
 * de desconto e o número de descendentes. Calcule o salário que serão as
 * horas trabalhadas x o valor por hora. Calcule o salário líquido (= Salário
 * Bruto – desconto). A cada dependente será acrescido R$ 100 no Salário
 * Líquido. Exiba o salário a receber.
 */

import javax.swing.JOptionPane;

public class Lt01_Proc16{


    static void calculaSal(int horaT, int valorH, double desc, int numDep){
        double salarioBruto, salarioLiquido;

        salarioBruto = horaT * valorH;
        salarioLiquido =  (salarioBruto - (salarioBruto * (desc/100)));
        salarioLiquido = salarioLiquido + (numDep * 100);

        JOptionPane.showMessageDialog(null,"O salario liquido eh "+ salarioLiquido);

    }

    public static void main(String[] args) {
        int horaT, valorH, numDep;
        double desc;

        horaT = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de horas "));
        valorH = Integer.parseInt(JOptionPane.showInputDialog("Valor de horas "));
        numDep = Integer.parseInt(JOptionPane.showInputDialog("Numero depem "));
        desc = Double.parseDouble(JOptionPane.showInputDialog("Percentual desconto "));

        calculaSal(horaT, valorH, desc, numDep);

        
    }
}