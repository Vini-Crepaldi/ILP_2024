
//Receba um número. Calcule e mostre os resultados da tabuada desse número.

import javax.swing.JOptionPane;

public class Lt01_Func34 {

    static int funcTab(int num, int mult){
        int res =  num * mult;
        return res;
    }
    public static void main(String[] args) {
        int num;

        num = Integer.parseInt(JOptionPane.showInputDialog("Numero? "));
        
        for(int cta = 1; cta <= 10; cta ++){
            System.out.println(num +" x "+ cta+ " = "+ funcTab(num,cta));
        }
    }
}
