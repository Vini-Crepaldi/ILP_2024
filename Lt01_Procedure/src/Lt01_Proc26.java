//Receba 2 números inteiros. Verifique e mostre se o maior número é múltiplo do menor.

import javax.swing.JOptionPane;

public class Lt01_Proc26 {
    static void multiplo(int v1, int v2){
        
        if(v1>v2){          //dentro dessa condional pode se ter outras condicionasi
            if((v1 % v2)==0){           //2 condições com 2 condições cada
                JOptionPane.showMessageDialog(null, "O maior e multiplo do menor");
            }else{
                JOptionPane.showMessageDialog(null, "Nao e multiplo");
            }

        }
        if(v1<v2){          //dentro dessa condional pode se ter outras condicionasi
            if((v2 % v1)==0){           //2 condições com 2 condições cada
                JOptionPane.showMessageDialog(null, "O maior e multiplo do menor");
            }else{
                JOptionPane.showMessageDialog(null, "Nao e multiplo");
            }

        }
    }
    public static void main(String[] args) {
        int n1,n2;

        n1 = Integer.parseInt(JOptionPane.showInputDialog("n1"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("n2"));

        multiplo(n1,n2);
    }
}
