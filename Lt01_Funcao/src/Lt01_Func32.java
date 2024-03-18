// Receba um número inteiro. Calcule e mostre o seu fatorial.
import javax.swing.*;
public class Lt01_Func32 {


    static int fat(int num){
        for(int cta = (num - 1); cta > 1; cta--){
            num = (num * cta);
        }
        return num;
    }
    public static void main(String[] args) {
        int num;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Numero? "));

        JOptionPane.showMessageDialog(null,"Fatorial: "+ fat(num));

    }
}
