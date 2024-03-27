//Receba 100 números inteiros reais. Verifique e mostre o maior e o menos valor. Obs.: somente valores positivos.


import javax.swing.JOptionPane;
public class Lt01_Func38 {


    static int calculaB(int n, int b){
        if(n > b){
            b = n;
        }
        return b;
    }
    static int calculaL(int n, int l){
        if(n < l || l == 0){
            l = n;
        }
        return l;
    }
    public static void main(String[] args) {
        int num, numB = 0,numL = 0;
        for(int cta = 1; cta <= 100;cta++){
            num =  Integer.parseInt(JOptionPane.showInputDialog("Digite um numero "));

            numB = calculaB(num,numB);
            numL = calculaL(num,numL);
        }

        JOptionPane.showMessageDialog(null,"Maior: "+numB);
        JOptionPane.showMessageDialog(null,"Menor: "+numL);
        
    }
}
