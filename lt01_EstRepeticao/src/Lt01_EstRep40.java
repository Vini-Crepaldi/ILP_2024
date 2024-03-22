
//Receba 2 números inteiros. Verifique e mostre todos os números primos existentes entre eles.
// crtl H

import javax.swing.*;
public class Lt01_EstRep40 {
    
    public static void main(String[] args) {
<<<<<<< HEAD
        double n1,n2;
        int teste = 0;
=======
        int n1, n2, primo = 0;

        n1 =  Integer.parseInt(JOptionPane.showInputDialog("Primeiro numero "));
        n2  =  Integer.parseInt(JOptionPane.showInputDialog("segundo  numero "));
>>>>>>> f4bd492606713c2e92503ea03e33b5c464a85f64

        n1 = Double.parseDouble(JOptionPane.showInputDialog("Primeiro numero "));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Segundo numero "));

        if(n1>n2){
<<<<<<< HEAD

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
=======
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

>>>>>>> f4bd492606713c2e92503ea03e33b5c464a85f64
            }
        }
    }
}
