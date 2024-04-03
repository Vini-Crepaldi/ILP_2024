/*
 * Criar e coletar valores inteiros nos vetores VT1[3] e VT2[3]. Concatenar
 * esses valores em um 3º vetor (VT3[6]) e mostrar os seus dados. P. ex:
 *   
 *    VT1:| 1| 2| 3|    //   VT2:| 4| 5| 6|    //    VT3:| 1| 2| 3| 4| 5| 6|
 */
import java.util.Random;
public class Lt03_Vet03 {

    static int[] carregaVetor(int vet[]){
        Random aleatorio = new Random();

        for(int cta = 0; cta < vet.length; cta++){
            vet[cta] = aleatorio.nextInt(1, 10);
        }
        return vet;
    }

    static void mostraVetor(int vet[]){
        for(int cta = 0; cta < vet.length; cta++){
            System.out.print(vet[cta]+", ");
        }
        System.out.println();   

    }

    static int[] cocatenaVetor(int vet1[],int vet2[]){
        int vet3[] = new int[6];
        int ind = 0;

        for(int cta = 0; cta < vet3.length; cta++){

            if(cta < vet1.length){
                vet3[cta] = vet1[cta];
            }else{
                vet3[cta] = vet2[ind];
                ind++;   
            }
        }

        return vet3;

    }
    public static void main(String[] args) {
        int vetor1[] = new int[3];
        int vetor2[] = new int[3];
        int vetor3[] = new int[6];

        vetor1 = carregaVetor(vetor1);
        vetor2 = carregaVetor(vetor2);
        vetor3 = cocatenaVetor(vetor1,vetor2);

        System.out.print("Vetor 1: ");
        mostraVetor(vetor1);

        System.out.print("Vetor 2: ");
        mostraVetor(vetor2);
        
        System.out.print("Vetor 3: ");
        mostraVetor(vetor3);
    }
}
