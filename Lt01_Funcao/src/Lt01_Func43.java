/*
 * Calcule e mostre quantos anos serão necessários para que Ana seja maior que
 * Maria sabendo que Ana tem 1,10 m e cresce 3 cm ao ano e Maria tem 1,5 m
 * e cresce 2 cm ao ano.
 */

import javax.swing.JOptionPane;

public class Lt01_Func43 {
    
    static int calculaIdade(int ana, int maria){
        int ano = 0;

        while(ana<maria){
            ana += 3;
            maria += 2;
            ano++;
        }
        return ano;
    }
    public static void main(String[] args) {
        int res;

        res = calculaIdade(110, 150);

        JOptionPane.showMessageDialog(null,"Total de anos: "+res);
    }
}   
