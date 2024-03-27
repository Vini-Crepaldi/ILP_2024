

//Receba o número da base e do expoente. Calcule e mostre o valor da potência.

import javax.swing.JOptionPane;

public class Lt01_Func44 {

    static int aooPotencia(int b, int e){
        int acumulador = b; 
        for(int cta = 2; cta<= e; cta++){ // contatdor vale 2 pq o valor da potencia esta em 2 variaveis
            acumulador = acumulador * b;  // 5 * 5 // 25 * 5// ....
        }
        return acumulador;

    }
    public static void main(String[] args) {
        int base, expoente, res;

        base = Integer.parseInt(JOptionPane.showInputDialog("Qual base"));
        expoente = Integer.parseInt(JOptionPane.showInputDialog("Qual expoente"));

        res = aooPotencia(base, expoente);


        JOptionPane.showMessageDialog(null,res);

    }
}
