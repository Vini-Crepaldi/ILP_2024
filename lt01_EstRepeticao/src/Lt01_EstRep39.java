/*
 * Calcule a quantidade de grãos contidos em um tabuleiro de xadrez onde:
 * Casa: 1 2 3 4 ... 64
 * Qte: 1 2 4 8 ... N
 */

import javax.swing.JOptionPane;

public class Lt01_EstRep39 {
    public static void main(String[] args) {
        double parametro;
        double acumulador = 1;
        double soma=1;
        

        parametro = Double.parseDouble(JOptionPane.showInputDialog("Parametro "));
        
        double cta = 1;

        while (acumulador < parametro || cta == 64) {
            System.out.print(acumulador+", ");
            acumulador = (acumulador * 2);
            soma = soma + acumulador;
            cta++;
        }

        System.out.println("\n a soma eh "+soma);
        System.out.println(cta);
        
        
    }
}
