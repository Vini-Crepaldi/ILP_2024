/*
 * . Criar e coletar um vetor [50] inteiro. Calcular e exibir: 
 * a. A média dos valores entre 10 e 200;
 * b. A soma dos números ímpares.
 */

import javax.swing.JOptionPane;

public class Lt03_Vet01 {
    public static void main(String[] args) {
        int vetor[] = new int[5];
        float media = 0;
        int impar = 0;
        float cont = 0;


        for(int cta = 0; cta < vetor.length ;cta ++){
                vetor[cta] = Integer.parseInt(JOptionPane.showInputDialog("Valor para vetor"));

            if(vetor[cta] > 10 && vetor[cta] < 200){
                media += vetor[cta];
                cont++;
            }
            if((vetor[cta]%2) != 0){
                impar += vetor[cta];
            }

        }
        media = media/cont;
        System.out.println("media "+media);
        System.out.println("impares "+impar);

    }
}
