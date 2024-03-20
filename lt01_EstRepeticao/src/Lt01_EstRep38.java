//Receba 100 números inteiros reais. Verifique e mostre o maior e o menos valor. Obs.: somente valores positivos.


import javax.swing.JOptionPane;
public class Lt01_EstRep38 {
    
    public static void main(String[] args) {
        System.out.println("comeco");

        int num, cod = 0, maior = 0 , menor = 0;
       
        for(int cta = 1; cta <= 100; cta++){
            while(cod != 2){
                num = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um numero"));

                if(maior<num){
                    maior = num;
                }
                if(menor>num ||  menor == 0){
                    menor = num;
                }
                cod = Integer.parseInt(JOptionPane.showInputDialog("Deseja continuar?\n1-Sim\n2-Nao"));

            }
         }

        JOptionPane.showMessageDialog(null, "Maior: "+maior);
        JOptionPane.showMessageDialog(null, "Menor: "+menor);
       
    }
    
}
