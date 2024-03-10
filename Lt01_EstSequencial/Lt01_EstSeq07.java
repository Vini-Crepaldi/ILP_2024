// Receba os valores do comprimento, largura e altura de um paralelepípedo.
// Calcule e mostre seu volume.

import javax.swing.*;;
public class Lt01_EstSeq07 {
    public static void main(String[] args) {
        int lar, alt, comp, AreaTotal;


        lar = Integer.parseInt(JOptionPane.showInputDialog("Largura: "));
        alt = Integer.parseInt(JOptionPane.showInputDialog("Altura: "));
        comp = Integer.parseInt(JOptionPane.showInputDialog("Comprimento "));

        AreaTotal = (((lar*comp)+(lar*alt)+(alt*comp)) * 2); 

        JOptionPane.showMessageDialog(null,"Area Total "+ AreaTotal);

        
    }
}
