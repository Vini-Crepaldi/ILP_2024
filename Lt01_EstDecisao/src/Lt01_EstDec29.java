/*
 * Receba o tipo de investimento (1 = poupança e 2 = renda fixa) e o valor do
 * investimento. Calcule e mostre o valor corrigido em 30 dias sabendo que a
 * poupança = 3% e a renda fixa = 5%. Demais tipos não serão considerados.
 */



import javax.swing.*;
public class Lt01_EstDec29 {
    public static void main(String[] args) {
        double valorIn;
        int cod=0;
        
        
        cod = Integer.parseInt(JOptionPane.showInputDialog("Qual tipo de investimento: \n1 - poupança \n2 - renda fixa"));
        valorIn = Double.parseDouble(JOptionPane.showInputDialog(null, "valor investimento"));


        switch (cod) {
            case 1:
                valorIn = (valorIn + (valorIn * 0.3));
                JOptionPane.showMessageDialog(null, "Valor atualizado" + valorIn);
                break;
            case 2:
                valorIn = (valorIn + (valorIn * 0.5));
                JOptionPane.showMessageDialog(null, "Valor atualizado" + valorIn);
                break;

            default:
                JOptionPane.showMessageDialog(null,"Valor invalido");
                break;
        }
        ;

     }  
    
    

 }