
//Receba 2 números inteiros. Verifique e mostre todos os números primos existentes entre eles.
// crtl H

import javax.swing.*;
public class Lt01_EstRep40 {
    
    public static void main(String[] args) {
        int n1, n2, primo = 0;

        n1 =  Integer.parseInt(JOptionPane.showInputDialog("Primeiro numero "));
        n2  =  Integer.parseInt(JOptionPane.showInputDialog("segundo  numero "));


        if(n1>n2){
            for(int cta = (n1-1); cta > n2; cta--){
                primo = 1;

                for(int ind = (cta-1); ind > 1; ind--){
                    if(cta%ind == 0){
                        primo = 0;
                        ind = 0;
                    }

                    
                }

                switch (primo) {
                    case 1: System.out.println(cta);
                        
                        break;
                
                    default:
                        break;
                }

            }
            

        }else{
            for(int cta = (n2-1); cta > n1; cta--){
                primo = 1;

                for(int ind = (cta-1); ind > 1; ind--){
                    if(cta%ind == 0){
                        primo = 0;
                        ind = 0;
                    }

                    
                }

                switch (primo) {
                    case 1: System.out.println(cta);
                        
                        break;
                
                    default:
                        break;
                }

            }
        }
    }
}