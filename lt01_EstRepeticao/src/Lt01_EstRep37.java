import java.util.Scanner;

    /* Receba um número inteiro. Calcule e mostre a série de Fibonacci até o seu
     * N’nésimo termo.
     */

public class Lt01_EstRep37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro N: ");
        int N = scanner.nextInt();
        scanner.close();

        int primeiroTermo = 0;
        int segundoTermo = 1;

        System.out.println("Série de Fibonacci até o " + N + "º termo:");

        if (N >= 1) {
            System.out.print(primeiroTermo);
        }
        if (N >= 2) {
            System.out.print(", " + segundoTermo);
        }

        for (int i = 3; i <= N; i++) {
            int proximoTermo = primeiroTermo + segundoTermo;
            System.out.print(", " + proximoTermo);
            primeiroTermo = segundoTermo;
            segundoTermo = proximoTermo;
        } 

        System.out.println();
    }
}