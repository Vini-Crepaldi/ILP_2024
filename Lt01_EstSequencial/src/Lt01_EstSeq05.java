/* Receba os coeficientes A, B e C de uma equação do 2º grau
 * (AX²+BX+C=0). Calcule e mostre as raízes reais (considerar que a
 *  equação possue2 raízes). 
 */

import javax.swing.*;

public class Lt01_EstSeq05 {
    public static void main(String[] args) {
        double a,b,c,delta,r1,r2;

        a = Double.parseDouble(JOptionPane.showInputDialog("A "));
        b = Double.parseDouble(JOptionPane.showInputDialog("B "));
        c = Double.parseDouble(JOptionPane.showInputDialog("C "));

        delta = ((b*b) -4*(a*c));

        r1 = (-b + (Math.sqrt(delta)))/2*a;
        r2 = (-b - (Math.sqrt(delta)))/2*a;

    
        
        JOptionPane.showMessageDialog(null,"Delta "+ delta);
        JOptionPane.showMessageDialog(null,"Primeira raiz: "+ r1);
        JOptionPane.showMessageDialog(null,"Segunda raiz: "+ r2);
        
    }
    
}
