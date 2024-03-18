/*
 * Receba o tipo de investimento (1 = poupança e 2 = renda fixa) e o valor do
 * investimento. Calcule e mostre o valor corrigido em 30 dias sabendo que a
 * poupança = 3% e a renda fixa = 5%. Demais tipos não serão considerados.
 */

import javax.swing.JOptionPane;

public class Lt01_Proc29 {

    static void poupanca(double valor){

        valor = (valor +(valor * 0.03));
        JOptionPane.showMessageDialog(null,"Valor reajustado "+valor);
    }

    static void rendaFixa(double valor){
        valor = (valor +(valor * 0.05));
        JOptionPane.showMessageDialog(null,"Valor reajustado "+valor);
    }
    public static void main(String[] args) {
        double valor;
        int cod = 0;
        
        cod = Integer.parseInt(JOptionPane.showInputDialog("Qual tipo de investimento\n1-Poupanca\n2-Renda fixa"));
        valor = Double.parseDouble(JOptionPane.showInputDialog("Qual valor"));
        
        switch (cod) {
            case 1:
                poupanca(valor);
                break;
            case 2:
                rendaFixa(valor);
                break;
            default: JOptionPane.showMessageDialog(null,"Valor invalido");
                break;
        }
    }
}
