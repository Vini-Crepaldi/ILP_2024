
    /* Receba um número inteiro. Calcule e mostre a série de Fibonacci até o seu
     * N’nésimo termo.
     */

import javax.swing.JOptionPane;

public class Lt01_Func37 {


    static int termo(int pri, int seg){
        int prox;
        prox = pri + seg;
        return prox;


    }
    public static void main(String[] args) {

        int n = Integer.parseInt(JOptionPane.showInputDialog("Qual parametro"));
        System.out.println("Série de Fibonacci até o " + n + "º termo:");

        int primeiroTermo = 0;
        int segundoTermo = 1;


        if (n >= 1) {
            System.out.print(primeiroTermo);
        }
        if (n >= 2) {
            System.out.print(", " + segundoTermo);
        }


        for (int i = 3; i <= n; i++) {
            int proximoTermo = termo(primeiroTermo,segundoTermo);
            System.out.print(", " + proximoTermo);
            primeiroTermo = segundoTermo;
            segundoTermo = proximoTermo;
        } 

    }
}