//Receba 2 valores inteiros. Calcule e mostre o resultado da diferença domaior pelo menos valor.

import javax.swing.JOptionPane;

public class Lt01_EstDec18 {
    public static void main(String[] args) {
        int n1,n2;

        n1 = Integer.parseInt(JOptionPane.showInputDialog("N1"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("N2"));


        if(n1>n2){
            JOptionPane.showMessageDialog(null,n1 -n2 );
        }else{
            JOptionPane.showMessageDialog(null,n1 -n2 );
        }
    }
    
}