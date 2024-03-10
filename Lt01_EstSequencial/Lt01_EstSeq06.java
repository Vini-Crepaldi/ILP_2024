//Receba os valores em x e y. Efetua a troca de seus valores e mostre seus conteúdos.

import javax.swing.*;

public class Lt01_EstSeq06 {
    public static void main(String[] args) {
        int x,y , troca;


        x = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de X"));
        y = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de Y"));

        troca = x;
        x = y;
        y = troca;

        JOptionPane.showMessageDialog(null,"O valor de X agora e: "+x);
        JOptionPane.showMessageDialog(null,"O valor de Y agora e: "+y);

    }
}
