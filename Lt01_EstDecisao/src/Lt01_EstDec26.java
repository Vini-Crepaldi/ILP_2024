//. Receba 2 números inteiros. Verifique e mostre se o maior número é múltiplo do menor



import javax.swing.*;
public class Lt01_EstDec26 {
    public static void main(String[] args) {
        int v1, v2;

        v1 = Integer.parseInt(JOptionPane.showInputDialog("Qual o primeiro valor"));
        v2 = Integer.parseInt(JOptionPane.showInputDialog("Qual o primeiro valor"));

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
    
}
