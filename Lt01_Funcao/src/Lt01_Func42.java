

//Calcule e mostre a série 1 + 2/3 + 3/5 + ... + 50/99

import javax.swing.JOptionPane;

public class Lt01_Func42 {


    static float calculaSerie(double parametro){
        float ac = 1, divisor = 3;
        for(int dividendo = 2 ; dividendo <= parametro; dividendo++){
            ac = ac + (dividendo/divisor);
            
            System.out.println(dividendo+"/"+divisor);

            divisor = divisor + 2;
        }
        return ac;

    }
    public static void main(String[] args) {
        float res;
        int parametro;

        parametro = Integer.parseInt(JOptionPane.showInputDialog("Parametro de serie"));
        res = calculaSerie(parametro);

        System.out.println(res);
    }
}
