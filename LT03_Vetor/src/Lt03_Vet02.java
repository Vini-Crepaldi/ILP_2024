/*
 * Criar e coletar um vetor [100] inteiro e exibir:
 * a. O maior e o menor valor;
 * b. A média dos valores
 */

 import javax.swing.*;
 import java.util.*;

public class Lt03_Vet02 {

    static Random random = new Random();
    static int maior = 0;
    static int menor = 0;
    static int soma = 0;
    static float media = 0;



    static void carregaVetor(int vet[]){

        for(int cta = 0; cta < vet.length; cta++){
            vet[cta] = random.nextInt(1000);
        }
    }

    static int maior(int vet[]){
        for(int ind = 0; ind < vet.length; ind ++){
            if(vet[ind] > maior){
                maior = vet[ind];
            }
        }

        return maior;
    }

    static int menor(int vet[]){
        for(int ind = 0; ind < vet.length; ind ++){
            if(vet[ind] < menor || menor == 0){
               menor = vet[ind];
            }
        }
        return menor;
    }


    static float media(int vet[]){
        for(int ind = 1; ind < vet.length; ind ++){
            soma += vet[ind];
        }

        return soma;
    }
    static float mostra(int vet[]){
        for(int ind = 1; ind < vet.length; ind ++){
            System.out.println(vet[ind]);
        }

        return (soma/100);
    }
    


    public static void main(String[] args) {
        int cod = 0;
        int vetor[] = new int[100];
        
        while (cod != 9) {
            cod = Integer.parseInt(JOptionPane.showInputDialog("1 - Carrega Vetor\n2 - Mostra Vetor\n3 - Media\n 4 - Maior\n5 - Menor\n9 - Fim"));

            
            switch (cod) {
                case 1:
                carregaVetor(vetor); // perguntar ao prof
                break;
                
                case 2:
                mostra(vetor);
                break;
                case 3:
                media = media(vetor);
                JOptionPane.showMessageDialog(null,"Media "+media );
                break;
                case 4:
                maior = maior(vetor);
                JOptionPane.showMessageDialog(null,"maior "+maior );
                
                    break;
                    case 5:
                    menor = menor(vetor);
                    JOptionPane.showMessageDialog(null,"menor "+menor );
                    
                    default:
                    JOptionPane.showMessageDialog(null,"Fim " );
                    break;
                }
            }
        }
            
}