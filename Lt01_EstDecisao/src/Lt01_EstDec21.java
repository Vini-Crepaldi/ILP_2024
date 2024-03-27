/* Receba 4 notas bimestrais de um aluno. Calcule e mostre a média aritmética.
 * Mostre a mensagem de acordo com a média:
 * a. Se a média for >= 6,0 exibir “APROVADO”;
 * b. Se a média for >= 3,0 ou < 6,0 exibir “EXAME”;
 * c. Se a média for < 3,0 exibir “RETIDO”.
 */

import javax.swing.*;
public class Lt01_EstDec21 {
    public static void main(String[] args) {
        float n1, n2, n3, n4, media;

        n1 = Float.parseFloat(JOptionPane.showInputDialog("Primeiro valor "));
        n2 = Float.parseFloat(JOptionPane.showInputDialog("Segundo valor "));
        n3 = Float.parseFloat(JOptionPane.showInputDialog("Terceiro valor "));
        n4 = Float.parseFloat(JOptionPane.showInputDialog("Quarto valor "));

        media = (n1+n2+n3+n4)/4;

        if (media >= 6){
            JOptionPane.showMessageDialog(null,"APROVADO");
        }else{
            if((media >= 3 ) && (media < 6)){
                JOptionPane.showMessageDialog(null,"EXAME");
            }else{
                JOptionPane.showMessageDialog(null,"Retido");
            }
        }

    }
    
}
