import javax.swing.*;

    /* Receba um número inteiro. Calcule e mostre a série de Fibonacci até o seu
     * N’nésimo termo.
     */

public class Lt01_EstRep37  {
    public static void main(String[] args) {
        
        int parametro = Integer.parseInt(JOptionPane.showInputDialog("Qual termo "));

        int primeiroTermo = 0;
        int segundoTermo = 1;

        System.out.println("Série de Fibonacci até o " + parametro + "º termo:");

        if (parametro >= 1) {
            System.out.print(primeiroTermo);
        }
        if (parametro >= 2) {
            System.out.print(", " + segundoTermo);
        }

        for (int cta = 3 ; cta <= parametro ; cta ++) {
            
            int proximoTermo = primeiroTermo + segundoTermo;

            System.out.print(", " + proximoTermo);

            primeiroTermo = segundoTermo;
            segundoTermo = proximoTermo;
        } 

        System.out.println();
    }
}