//33. Receba um número. Calcule e mostre a série 1 + 1/2 + 1/3 + ... + 1/N.

import javax.swing.JOptionPane;

public class Lt01_Func33 {
    static double calculoSerie(double parametro){
        double ac = 1;

        for(double div = 2 ; div <=  parametro ; div++){
            ac = ac + (1/div);
        }
        
        return ac;
    }
    public static void main(String[] args) {
        int num;

        num = Integer.parseInt(JOptionPane.showInputDialog("Numero? "));
         
        System.out.println(calculoSerie(num));
    }
}
