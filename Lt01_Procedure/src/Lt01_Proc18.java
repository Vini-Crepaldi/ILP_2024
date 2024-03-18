//Receba 2 valores inteiros. Calcule e mostre o resultado da diferença do maior pelo menos valor

import javax.swing.*;
public class Lt01_Proc18 {

    static void diff(int n1, int n2){
        int res;
        if(n1>n2){
            res = n1 - n2;
            JOptionPane.showMessageDialog(null, "Resultado " + res);
        }else{
            res = n2 - n1;
            JOptionPane.showMessageDialog(null, "Resultado " + res);
        }

    }


    public static void main(String[] args) {
        int n1,n2;

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Valor 1"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Valor 2"));

        diff(n1,n2);
    }
}
