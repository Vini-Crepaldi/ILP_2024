
//Receba 2 números inteiros. Verifique e mostre todos os números primos existentes entre eles.


import javax.swing.*;
public class Lt01_EstRep40 {
    
    public static void main(String[] args) {
        double n1,n2;
        int teste = 0;

        n1 = Double.parseDouble(JOptionPane.showInputDialog("Primeiro numero "));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Segundo numero "));

        if(n1>n2){

            for(double cta = (n1-1); cta > n2;cta--){// fila n2, num, num... n1
                //System.out.println(cta);

                for(double ind = (cta - 1);ind > 1; ind-- ){
                    if(cta%ind == 0){
                        teste = 1;
                        ind = 1;
                    }    
                
                    
                }
                switch (teste) {
                    case 0: System.out.println(cta/*  Nao e primo"*/);
                        
                        break;
                
                    default: //System.out.println(cta+" E primo");
                        
                        break;
                }
            }
        }
    }
}
