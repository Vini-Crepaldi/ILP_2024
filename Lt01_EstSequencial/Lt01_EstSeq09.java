
//Receba os 2 números inteiros. Calcule e mostre a soma dos quadrados.


import javax.swing.*;
public class Lt01_EstSeq09 {
    public static void main(String[] args) {
        int num1,num2;

        num1 = Integer.parseInt(JOptionPane.showInputDialog("primeiro valor "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("segundo valor "));


        num1 = (num1*num1) + (num2*num2);

        JOptionPane.showMessageDialog(null,"QUADRADOS "+num1);


    }
    
}
