/* Receba 3 coeficientes A, B, e C de uma equação do 2º grau da fórmula AX²+BX+C=0. 
 * Verifique e mostre a existência de raízes reais e se caso exista, calcule e mostre.
 */
import javax.swing.*;
public class Lt01_EstDec20 {
    public static void main(String[] args) {
        double a, b, c, delta, x1,x2;

        a = Double.parseDouble(JOptionPane.showInputDialog("Valor a"));
        b = Double.parseDouble(JOptionPane.showInputDialog("Valor b"));
        c = Double.parseDouble(JOptionPane.showInputDialog("Valor c"));

        delta = ((b*b) -4*a*c);

        if (delta<0){
             JOptionPane.showMessageDialog(null,"Nao ha raizes ");
        }
        else{
            if(delta==0){
                x1 = ((-b + (Math.sqrt(delta)))/2);
                JOptionPane.showMessageDialog(null,"Valor de X1 " + x1);
                }
                else{
                    x1 = ((-b + (Math.sqrt(delta)))/2);
                    x2 = ((-b - (Math.sqrt(delta)))/2);
                    
                    JOptionPane.showMessageDialog(null,"O valor de X1 " + x1);
                    JOptionPane.showMessageDialog(null,"O valor de X2 " + x2);
                }
            } 

            
    }   
}

