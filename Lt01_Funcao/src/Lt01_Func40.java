
//Receba 2 números inteiros. Verifique e mostre todos os números primos existentes entre eles.

import javax.swing.*;
public class Lt01_Func40 {
    static int primo = 0;

    static int verificaPrimo(int cta){
        
        for(int i = (cta-1); i > 1 ; i-- ){
            primo = 1;

            if((cta % i) == 0){
                primo = 0;
                i = 0;
            }

        }

        return primo;

    }


    public static void main(String[] args) {
        int n1, n2;

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite primeiro numero"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite segundo numero"));

        if(n1 > n2){
            for(int cta = (n1 - 1);cta > n2; cta--){
                primo  = verificaPrimo(cta);
        
                switch (primo) {
                    case 1: System.out.println(cta);
                }
            }
        }
        
        if(n2 > n1){
            for(int cta = (n2 - 1);cta > n1; cta--){
                primo  = verificaPrimo(cta);
        
                switch (primo) {
                    case 1: System.out.println(cta);

                }
            }
        }



    }
}
