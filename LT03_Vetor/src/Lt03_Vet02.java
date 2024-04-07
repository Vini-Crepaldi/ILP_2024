/*
 * Criar e coletar um vetor [100] inteiro e exibir:
 * a. O maior e o menor valor;
 * b. A média dos valores
 */

 import javax.swing.*;
 import java.util.*;

public class Lt03_Vet02 {

    static int maior = 0;
    static int menor = 0;
    static float media = 0;


    //Procedimento que carrega o vetor com numeros aleatorios
    public static void carregaVetor(int vet[]){
        Random random = new Random();
        for(int cta = 0; cta < vet.length; cta++){
            vet[cta] = random.nextInt(1000);
        }
    }

    //Procedimento de mostrar vetor
    static void mostraVetor(int vet[]){
        for(int ind = 1; ind < vet.length; ind ++){
            System.out.println(vet[ind]);
        }
    }
    //Funcao que retorna o maior valor dentro do vetor
    static int registraMaior(int vet[]){
        for(int ind = 0; ind < vet.length; ind ++){
            if(vet[ind] > maior){
                maior = vet[ind];
            }
        }
        return maior;
    }

    //Funcao que retorna o menor valor dentro do vetor
    static int registraMenor(int vet[]){
        for(int ind = 0; ind < vet.length; ind ++){
            if(vet[ind] < menor || menor == 0){
               menor = vet[ind];
            }
        }
        return menor;
    }

    //Funcao que retorna a media dos valores dentro do vetor
    static float calculaMedia(int vet[]){
        int soma = 0;
        for(int ind = 0; ind < vet.length; ind ++){
            soma += vet[ind];
        }
        return (soma/100);
    }

    public static void main(String[] args) {
        int cod = 0;
        int vetor[] = new int[100];
        
        while (cod != 9) {
            cod = Integer.parseInt(JOptionPane.showInputDialog("1 - Carrega Vetor\n2 - Mostra Vetor\n3 - Media\n4 - Maior\n5 - Menor\n9 - Fim"));

            switch (cod){
                case 1:

                    carregaVetor(vetor);
                    break;

                case 2:

                    mostraVetor(vetor);
                    break;

                case 3:

                    media = calculaMedia(vetor); 
                    JOptionPane.showMessageDialog(null,"Media "+media );
                    break;

                case 4:

                    maior = registraMaior(vetor);
                    JOptionPane.showMessageDialog(null,"maior "+maior );
                    break;

                case 5:

                    menor = registraMenor(vetor);
                    JOptionPane.showMessageDialog(null,"menor "+menor );
                    break;
                    
                default: JOptionPane.showMessageDialog(null,"Fim " ); 
            }
        }
    }            
}