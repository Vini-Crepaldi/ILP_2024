

//Receba um número N. Calcule e mostre a série 1 + 1/1! + 1/2! + ... + 1/N!

import javax.swing.JOptionPane;

public class Lt01_EstRep36 {
    public static void main(String[] args) {
        double n, ac = 1,div = 1, clone;


        n = Double.parseDouble(JOptionPane.showInputDialog("Qual numero "));


        while (div <= n) {
            clone = div; // criar um clone do div pra nao alterar o parametro
            for(double cta = (clone - 1); cta > 1; cta--){ // praticamente uma funcao pra caulcular o fatorial 
                clone = (clone * cta);   
            }
            ac =  ac + 1/clone;
            div ++; // div incrementa 1 para faturar o proximo numero

            System.out.println(ac);
        }



        //ac =  ac + 1/div(fat)
    }
}
