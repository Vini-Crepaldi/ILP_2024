//Receba a base e a altura de um triângulo. Calcule e mostre a sua área
import javax.swing.*;


public class Lt01_EstSeq03 {
    public static void main(String[] args) {
        double base,alt,area;
        

        base = Double.parseDouble(JOptionPane.showInputDialog("Base: "));
        alt = Double.parseDouble(JOptionPane.showInputDialog("altura: "));
        area = ((base * alt)/2);


        JOptionPane.showMessageDialog(null,"Area"+ area);

    }    
}
