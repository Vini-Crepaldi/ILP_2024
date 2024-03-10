/*  
 * Receba o ano de nascimento e o ano atual. Calcule e mostre a sua idade e
 * quantos anos terá daqui a 17 anos.
 */

import javax.swing.*;




public class Lt01_EstSeq12{
    public static void main(String[] args){
        int anoAtual, anoNasc, idadeFut,idadeAtual;

        anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Qual o ano atual? "));
        anoNasc = Integer.parseInt(JOptionPane.showInputDialog("Qual o ano de nascimento? "));

        idadeAtual = anoAtual - anoNasc;
        idadeFut = idadeAtual + 17;

        JOptionPane.showMessageDialog(null,"A idade atual é: "+idadeAtual);
        JOptionPane.showMessageDialog(null,"A idade futura é: "+idadeFut);

    }
}
