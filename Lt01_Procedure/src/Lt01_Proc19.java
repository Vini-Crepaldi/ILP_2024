//9. Receba 2 valores reais. Calcule e mostre o maior deles
import javax.swing.*;
public class Lt01_Proc19 {
    static void maior(double n1, double n2){
        if(n1>n2){
            JOptionPane.showMessageDialog(null, "Maior: "+n1);
        }else{
            JOptionPane.showMessageDialog(null, "Maior: "+n2);

        }
    }

    public static void main(String[] args) {
        double n1, n2;

        n1 = Double.parseDouble(JOptionPane.showInputDialog("Valor 1 "));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Valor 2 "));

        maior(n1,n2);
    }
}
