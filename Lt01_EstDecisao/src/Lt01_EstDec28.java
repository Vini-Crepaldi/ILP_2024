/*
 * Receba o preço atual e a média mensal de um produto. Calcule e mostre o
 * novo preço sabendo que:
 * 
 *  Venda Mensal     Preço Atual     Preço Novo
 *    < 500             < 30            + 10%
 * >= 500 e < 1000  >= 30 e < 80         +15%
 *   >= 1000           >= 80             - 5%
 * 
 * Obs.: para outras condições, preço novo será igual ao preço atual
 */

import javax.swing.*;

public class Lt01_EstDec28 {
    public static void main(String[] args) {
        Double precoAtual, precoNovo, vendaMensal;

        precoAtual = Double.parseDouble(JOptionPane.showInputDialog("Qual o preco atual do produto"));
        vendaMensal = Double.parseDouble(JOptionPane.showInputDialog("Qual a media de vendo do produto"));

        //fazer com switch casae
        


    }
}
