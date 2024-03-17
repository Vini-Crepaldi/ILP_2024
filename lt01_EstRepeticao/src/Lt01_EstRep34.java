
//34. Receba um número. Calcule e mostre os resultados da tabuada desse número.

import javax.swing.JOptionPane;

public class Lt01_EstRep34 {
    public static void main(String[] args) {
        int num, tab;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Qual numero"));

        for(int cta = 1 ;cta <= 10; cta ++){
            tab = (num * cta);
            System.out.println(tab);

        }
    }
}
