/*
 * Receba 4 notas bimestrais de um aluno. Calcule e mostre a média aritmética.
 * Mostre a mensagem de acordo com a média:
 * a. Se a média for >= 6,0 exibir “APROVADO”;
 * b. Se a média for >= 3,0 ou < 6,0 exibir “EXAME”;
 * c. Se a média for < 3,0 exibir “RETIDO”.
 */

import javax.swing.JOptionPane;

public class Lt01_Proc21 {

    static void calculoMedia(double n1, double n2, double n3, double n4){
        double res;

        res = (n1 + n2 + n3 + n4)/4;

        JOptionPane.showMessageDialog(null,"resultado "+res);
        if(res >= 6){
            JOptionPane.showMessageDialog(null,"APROVADO ");
        }else if(res >= 3){
            JOptionPane.showMessageDialog(null,"EXAME ");
        }else{
        JOptionPane.showMessageDialog(null,"REPROVADO ");

        }

    }
    public static void main(String[] args) {
        double n1,n2,n3,n4;

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Numero 1 "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Numero 2 "));
        n3 = Integer.parseInt(JOptionPane.showInputDialog("Numero 3 "));
        n4 = Integer.parseInt(JOptionPane.showInputDialog("Numero 4 "));

        calculoMedia(n1,n2,n3,n4);
    }
}
