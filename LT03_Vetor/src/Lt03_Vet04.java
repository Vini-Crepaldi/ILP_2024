/*
 * Criar e coletar em um vetor [30] real e calcular e exibir:
 * a. A média do grupo;
 * b. A quantidade de notas acima do grupo;
 * c. As posições dos valores abaixo da média do grupo
 */

import java.util.Random;

import javax.swing.JOptionPane;

public class Lt03_Vet04 {

    static float[] carregaVetor(float vet[]){
        Random aleatorio = new Random();

        for(int cta = 0; cta < vet.length; cta++){
            vet[cta] = aleatorio.nextInt(1, 1000);
            //vet[cta] = cta;
            
        }

        return vet;
    }
    
    static float calculaMedia(float vet[]){

        float soma = 0;

        for(int cto = 0 ; cto < vet.length; cto++){
            soma += vet[cto];
        }
        
        return (soma/vet.length);
    }

    static String concatenaVetor(float vetor[]){
        String numeros = "";

        for(int i = 0; i < vetor.length; i++) {
            numeros += vetor[i] + ",\n ";

           // JOptionPane.showMessageDialog(null, numeros + ".");
        }
        return numeros;
    }

    static void maiorMenor(int num[], float vet[]){

        for(int i = 0; i < vet.length ; i++){
            if(vet[i] > num[0]){
                num[0] = (int)vet[i];
            }
            if(vet[i] < num[1] || num[1] == 0){
                num[1] = (int) vet[i];
            }
        }
    }   

    static int acimaMedia(float vet[], float media){
        int cont = 0;

        for(int i = 0; i < vet.length; i++){
            if(vet[i] > media){
                cont++;
            }
        }
    }


    public static void main(String[] args) {
        int opc = 0;
        float media = 0;
        float vetor[] = new float[30];
        
        while(opc != 9){
            opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Carrega Vetor\n2 - Mostra Vetor\n3 - Media\n4 - Acima da Media\nAbaixo da Media\n9 - Fim"));

            switch (opc) {
                case 1:
                    vetor = carregaVetor(vetor);
                    break;

                case 2:
                    String vet = concatenaVetor(vetor);
                    JOptionPane.showMessageDialog(null,"Vetor: \n " + vet);
                    System.out.println("Vetor: \n " + vet);
                    break;

                case 3:

                    media = calculaMedia(vetor);
                    JOptionPane.showMessageDialog(null, "media: "+ media);
                    break;

                case 4:
                   int acima = acimaMedia(vetor, media);
                    break;
                    
            }
        }
    }
}
