//Receba o salário de um funcionário e mostre o novo salário com reajuste de 15%.

import javax.swing.*;


public class Ex002 {
    public static void main(String[] args) {
        double sal,ajt;
        

        sal = Double.parseDouble(JOptionPane.showInputDialog("Salario: "));
        ajt = sal * 0.15;
        sal = sal + ajt;

        JOptionPane.showMessageDialog(null,"REajustado"+ sal);

    }    
}
