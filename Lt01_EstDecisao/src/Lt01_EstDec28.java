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
        int cod;

        precoAtual = Double.parseDouble(JOptionPane.showInputDialog("Qual o preco atual do produto"));
        vendaMensal = Double.parseDouble(JOptionPane.showInputDialog("Qual a media de vendo do produto"));

        if(vendaMensal < 500 && precoAtual <30){
            cod = 1;
        }
        else if(vendaMensal >= 1000 && precoAtual >= 80){
             cod = 2;
        }
        else if(vendaMensal >= 500 && vendaMensal < 1000 && precoAtual >= 30 && precoAtual < 80){
            cod = 3;
        }else{
            cod = 4;
        }

        switch (cod) {
            case 1: precoNovo = (precoAtual + (precoAtual * 0.10));
                    JOptionPane.showMessageDialog(null,"Novo Preco "+ precoNovo);
                break;

            case 2: precoNovo = (precoAtual - (precoAtual * 0.05));
                JOptionPane.showMessageDialog(null,"Novo Preco "+ precoNovo);
                break;

            case 3: precoNovo = (precoAtual + (precoAtual * 0.15));
                    JOptionPane.showMessageDialog(null,"Novo Preco "+ precoNovo);
                break;

            default: JOptionPane.showMessageDialog(null,"`Preco inalterao " + precoAtual);
                break;
        }


    }
}
