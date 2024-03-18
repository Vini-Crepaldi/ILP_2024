/*
 * Receba 3 valores obrigatoriamente em ordem crescente e um 4º valor não
 * necessariamente em ordem. Mostre os 4 números em ordem crescente.
 */

import javax.swing.JOptionPane;

public class Lt01_Proc23 {

    static void ordemNum(int v1, int v2, int v3, int v4){
        if ((v4 > v1) && (v4 < v2)){
            JOptionPane.showMessageDialog(null,v1+" "+v4+" "+v2+" "+v3);

        }else if((v4 > v2)&&(v4 < v3)){
            JOptionPane.showMessageDialog(null,v1+" "+v2+" "+v4+" "+v3);

        }else if(v4<v1){
            JOptionPane.showMessageDialog(null,v4+" "+v1+" "+v2+" "+v3);

        }else{
            JOptionPane.showMessageDialog(null,v1+" "+v2+" "+v3+" "+v4);
        }
    }
        
    
    public static void main(String[] args) {
        int n1,n2,n3,n4;

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Valor "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Valor "));
        n3 = Integer.parseInt(JOptionPane.showInputDialog("Valor "));
        n4 = Integer.parseInt(JOptionPane.showInputDialog("Valor "));

        ordemNum(n1,n2,n3,n4);
    }
}
