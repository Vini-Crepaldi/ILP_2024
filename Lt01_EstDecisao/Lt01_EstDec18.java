//Receba  2  valores  inteiros.  Calcule  e  mostre  o  resultado  da  diferença  do maior pelo menos valor.

import javax.swing.*;

public class Lt01_EstDec18 {
    public static void main(String[] args) {
        int v1, v2, res;

        v1 = Integer.parseInt(JOptionPane.showInputDialog("Qual o valor 1 "));
        v2 = Integer.parseInt(JOptionPane.showInputDialog("Qual o valor 2 "));


        if (v1 > v2){
            res = (v1-v2);
            JOptionPane.showMessageDialog(null,"Resultado: "+ res);
        }
        if (v1 < v2){
            res = (v2-v1);
            JOptionPane.showMessageDialog(null,"Resultado: "+ res);
            
        } 
        
     

        

    }
    
}
