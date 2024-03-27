/*
 * Receba 3 coeficientes A, B, e C de uma equação do 2º grau da fórmula
 * AX²+BX+C=0. Verifique e mostre a existência de raízes reais e se caso
 * exista, calcule e mostre.
 */

import javax.swing.JOptionPane;

public class Lt01_Proc20{

    static void equacao(int a, int b, int c){
        double delta, x1, x2;

        delta = ((b*b)-4*a*c);

        if(delta < 0 ){
            JOptionPane.showMessageDialog(null,"Nao ha raizes");
        }else if(delta == 0){
            x1 = ((-b + (Math.sqrt(delta)))/2);
            JOptionPane.showMessageDialog(null,x1);
        }else{
            x1 = ((-b + (Math.sqrt(delta)))/2);
            x2 = ((-b - (Math.sqrt(delta)))/2);
            JOptionPane.showMessageDialog(null,x1+" "+x2);
        }
    }


    public static void main(String[] args) {
        int a,b,c;

        a = Integer.parseInt(JOptionPane.showInputDialog("Valor a "));
        b = Integer.parseInt(JOptionPane.showInputDialog("Valor b "));
        c = Integer.parseInt(JOptionPane.showInputDialog("Valor c "));

        equacao(a,b,c);
    }

}