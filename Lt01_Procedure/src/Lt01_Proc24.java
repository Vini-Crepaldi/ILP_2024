
//Receba um valor inteiro. Verifique e mostre se é divisível por 2 e 3.

import javax.swing.JOptionPane;

public class Lt01_Proc24 {

    static void div(int num){
        if((num % 2)==0){
            JOptionPane.showMessageDialog(null,"E divisivel por 2");
        }else{
            JOptionPane.showMessageDialog(null,"Nao e divisivel por 2");
        }
        if((num % 3)==0){
            JOptionPane.showMessageDialog(null,"E divisivel por 3");
        }else{
            JOptionPane.showMessageDialog(null,"Nao e divisivel por 3");
        }
    }
    public static void main(String[] args) {
        int valor;

        valor = Integer.parseInt(JOptionPane.showInputDialog("qual valor "));

        div(valor);
    }
}
