/**
 * Criar e coletar em um vetor [20] inteiro. Calcule e exiba, segundo: SIGMA
 * 
 *  10 = limite
 *  ∑ (A[0] – A[20–1]) = somatoria = ac +=  A
 *  i = 1 = incremento
 */
import java.util.Scanner;
import java.util.Random;
public class Lt03_Vet05 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int vetor[] = new int[20];
        int cod = 0;

    while (cod != 9) {

            System.out.print("\n    Menu\n1 - Carrega Vetor\n2 - Mostra Vetor\n3 - Ordenna Vetor\n");
            cod = input.nextInt();
           // input.close();
            
            switch (cod) {
                case 1:
                    CarregaVetor(vetor);
                    break;
                case 2: 
                    MostraVet(vetor);
                    break;
                case 3:
                    BobbleSort(vetor);
                    break;
            }


        }
    }


    static int[] CarregaVetor(int vet[]){
        Random ran = new Random();

        for(int cta = 0; cta < vet.length; cta++){
            vet[cta] = ran.nextInt(0, 50);
        }

        return vet;
    }
    static int[] BobbleSort(int vet[]){
        int temp;
        for(int i = 0; i < vet.length - 1 ; i++){
            for(int j = (i + 1); j < vet.length;  j++){
                if(vet[i] > vet[j]){
                    temp = vet[i];
                    vet[i] = vet[j];
                    vet[j] = temp;

                }
            }
        }


        return vet;
    }


    static void MostraVet(int vet[]){
        String vezor = "";
        String verzor = "";
        for(int cta = 0; cta < vet.length; cta++){

            vezor = (vezor +"| "+vet[cta] +" |");
            verzor = (verzor +"| " + cta +" |");
        }
        System.out.println(verzor);
        System.out.println(vezor);
    }
}
