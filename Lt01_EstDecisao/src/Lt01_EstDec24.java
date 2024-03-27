//Receba um valor inteiro. Verifique e mostre se é divisível por 2 e 3.


import javax.swing.*;
public class Lt01_EstDec24 {
    public static void main(String[] args) {
    double num,div2,div3;

    num = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor"));

    div2 = (num % 2);
    div3 = (num % 3);

    if(div2 == 0){
        JOptionPane.showMessageDialog(null,"Divisivel por 2");
    }else{
        JOptionPane.showMessageDialog(null,"Nao e divisivel por 2");
    }
    if(div3 == 0){
        JOptionPane.showMessageDialog(null,"Divisivel por 3");
    }else{
        JOptionPane.showMessageDialog(null,"Nao e divisivel por 3");
    }
 }
}
